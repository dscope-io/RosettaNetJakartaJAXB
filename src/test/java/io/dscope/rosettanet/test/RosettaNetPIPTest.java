package io.dscope.rosettanet.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

class RosettaNetPIPTest {

    private static final List<DictionaryEntry> DICTIONARY = loadDictionary();

    @ParameterizedTest(name = "{0} {1} {2}")
    @MethodSource("pipPayloads")
    void roundTripRosettaNetMessage(String pipType, String messageVersion, String messageName, Path samplePath) throws Exception {
    DictionaryEntry definition = resolveMessageDefinition(pipType, messageVersion, messageName);
        JAXBContext context = createJaxbContext(definition);

        String samplePayload = readSample(samplePath);

        JAXBElement<?> element = unmarshalPayload(context, samplePayload);
        Class<?> expectedElementClass = resolveMessageClass(definition);
        Class<?> expectedValueClass = resolveMessageValueClass(definition);
        assertThat(element.getName().getLocalPart())
            .as("Unmarshalled element name should match %s", messageName)
            .isEqualTo(messageName);
        Object payload = element.getValue();
        assertThat(payload)
            .as("Unmarshalled payload should provide a value for %s", messageName)
            .isNotNull();
        assertThat(element)
            .as("Unmarshalled element should be %s", expectedElementClass.getName())
            .isInstanceOf(expectedElementClass);
        assertThat(element.getDeclaredType())
            .as("JAXB element declared type should be %s", expectedValueClass.getName())
            .isEqualTo(expectedValueClass);
        assertThat(payload)
            .as("Unmarshalled value should be an instance of %s", expectedValueClass.getName())
            .isInstanceOf(expectedValueClass);

        String marshalled = marshalPayload(context, element);
        assertThat(marshalled)
            .as("Marshalled XML should contain the %s root element", messageName)
            .contains(messageName);
    }

    @SuppressWarnings("unused")
    private static Stream<Arguments> pipPayloads() {
        try {
            Document specifications = loadSpecifications();
            List<DictionaryEntry> definitions = DICTIONARY;
            List<Object[]> combinations = new ArrayList<>();

            NodeList specNodes = specifications.getElementsByTagName("spec");
            for (int i = 0; i < specNodes.getLength(); i++) {
                Element specElement = (Element) specNodes.item(i);
                String pipType = specElement.getAttribute("name");
                String specPath = specElement.getAttribute("path");
                String propertiesFile = specElement.getAttribute("propertiesFile");
                String propertiesFileName = extractFileName(propertiesFile);

                NodeList rootBindings = specElement.getElementsByTagName("rootBinding");
                for (int j = 0; j < rootBindings.getLength(); j++) {
                    Element rootBinding = (Element) rootBindings.item(j);
                    String bindingName = rootBinding.getAttribute("name");
                    String messageName = extractMessageName(bindingName);
                    Optional<String> bindingVersion = extractMessageVersion(bindingName);

                    Optional<Path> sample = resolveSamplePath(specPath, messageName);
                    if (sample.isEmpty()) {
                        continue;
                    }

                    Optional<DictionaryEntry> definition = findDefinition(
                        definitions,
                        pipType,
                        messageName,
                        propertiesFileName,
                        bindingVersion
                    );

                    if (definition.isEmpty()) {
                        continue;
                    }

                    DictionaryEntry entry = definition.get();

                    if (!isContextCreatable(entry)) {
                        continue;
                    }

                    if (!matchesSampleRoot(entry, sample.get())) {
                        continue;
                    }

                    combinations.add(new Object[] {
                        entry.type(),
                        entry.version(),
                        entry.name(),
                        sample.get()
                    });
                }
            }

            combinations.sort(Comparator
                .comparing((Object[] entry) -> (String) entry[0])
                .thenComparing(entry -> (String) entry[1])
                .thenComparing(entry -> (String) entry[2])
            );

            return combinations.stream().map(entry -> Arguments.of(entry[0], entry[1], entry[2], entry[3]));
        } catch (IOException | ParserConfigurationException | SAXException ex) {
            throw new IllegalStateException("Unable to enumerate RosettaNet PIP samples", ex);
        }
    }

    private static Document loadSpecifications() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        configureFactory(factory);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Path specsPath = Paths.get("src", "main", "xsd", "specs.xml");
        return builder.parse(specsPath.toFile());
    }

    private static Optional<Path> resolveSamplePath(String specPath, String messageName) {
        Path specRelative = Paths.get(specPath);
        Path suffix = specRelative.getNameCount() > 2 ? specRelative.subpath(2, specRelative.getNameCount()) : specRelative;
        Path xmlDirectory = Paths.get("src", "main", "xsd").resolve(suffix);
        Path parent = xmlDirectory.getParent();
        if (parent == null) {
            return Optional.empty();
        }
        Path descriptiveDirectory = parent.resolve("Descriptive");

        if (!Files.exists(descriptiveDirectory)) {
            return Optional.empty();
        }

        String targetFile = messageName + ".xml";
        try (Stream<Path> paths = Files.walk(descriptiveDirectory, 4)) {
            return paths
                .filter(Files::isRegularFile)
                .filter(path -> path.getFileName().toString().equals(targetFile))
                .findFirst();
        } catch (IOException ex) {
            throw new IllegalStateException("Unable to locate sample XML for " + messageName, ex);
        }
    }

    private static List<DictionaryEntry> loadDictionary() {
        try (InputStream inputStream = RosettaNetPIPTest.class.getResourceAsStream("/RosettaNet_Dictionary.xml")) {
            if (inputStream == null) {
                throw new IllegalStateException("RosettaNet dictionary resource not found on the classpath");
            }
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            configureFactory(factory);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            NodeList nodes = document.getElementsByTagName("message");
            List<DictionaryEntry> entries = new ArrayList<>(nodes.getLength());
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                Element element = (Element) node;
                entries.add(new DictionaryEntry(
                    element.getAttribute("type"),
                    element.getAttribute("version"),
                    element.getAttribute("name"),
                    element.getAttribute("package"),
                    element.getAttribute("properties")
                ));
            }
            return entries;
        } catch (IOException | ParserConfigurationException | SAXException ex) {
            throw new IllegalStateException("Unable to load RosettaNet dictionary", ex);
        }
    }

    private static Properties loadProperties(String resourceName) {
        String path = resourceName.startsWith("/") ? resourceName : "/" + resourceName;
        try (InputStream inputStream = RosettaNetPIPTest.class.getResourceAsStream(path)) {
            if (inputStream == null) {
                throw new IllegalStateException("RosettaNet properties file not found on the classpath: " + path);
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException ex) {
            throw new IllegalStateException("Unable to load RosettaNet properties: " + path, ex);
        }
    }

    private static boolean isContextCreatable(DictionaryEntry entry) {
        try {
            Properties properties = loadProperties(entry.properties());
            String contextPath = properties.getProperty("packages");
            if (contextPath == null || contextPath.isBlank()) {
                return false;
            }
            JAXBContext.newInstance(contextPath.trim());
            return true;
        } catch (IllegalStateException | JAXBException ex) {
            return false;
        }
    }

    private static boolean matchesSampleRoot(DictionaryEntry entry, Path samplePath) {
        try (InputStream inputStream = Files.newInputStream(samplePath)) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            configureFactory(factory, true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            Element root = document.getDocumentElement();
            if (root == null) {
                return false;
            }
            JAXBElement<?> expected = instantiateRootElement(entry);
            String expectedLocal = expected.getName().getLocalPart();
            String expectedNamespace = Optional.ofNullable(expected.getName().getNamespaceURI()).orElse("");
            String actualLocal = Optional.ofNullable(root.getLocalName()).orElse(root.getTagName());
            String actualNamespace = Optional.ofNullable(root.getNamespaceURI()).orElse("");
            return expectedLocal.equals(actualLocal) && expectedNamespace.equals(actualNamespace);
        } catch (IOException | ParserConfigurationException | SAXException ex) {
            return false;
        }
    }

    private static void configureFactory(DocumentBuilderFactory factory) throws ParserConfigurationException {
        configureFactory(factory, false);
    }

    private static void configureFactory(DocumentBuilderFactory factory, boolean namespaceAware) throws ParserConfigurationException {
        factory.setNamespaceAware(namespaceAware);
        factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        factory.setExpandEntityReferences(false);
    }

    private static int parseVersion(String version) {
        if (version == null || version.isBlank()) {
            return Integer.MIN_VALUE;
        }
        String numeric = version.replaceAll("[^0-9]", "");
        if (numeric.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(numeric);
    }

    private record DictionaryEntry(String type, String version, String name, String packageName, String properties) { }

    private static Optional<DictionaryEntry> findDefinition(
        List<DictionaryEntry> definitions,
        String pipType,
        String messageName,
        String propertiesFileName,
        Optional<String> bindingVersion
    ) {
        return definitions.stream()
            .filter(definition -> pipType.equals(definition.type()))
            .filter(definition -> messageName.equals(definition.name()))
            .filter(definition -> propertiesFileName.equals(definition.properties()))
            .filter(definition -> bindingVersion.isEmpty() || bindingVersion.get().equals(definition.version()))
            .findFirst();
    }

    private static String extractFileName(String path) {
        if (path == null || path.isBlank()) {
            return path;
        }
        Path asPath = Paths.get(path);
        Path fileName = asPath.getFileName();
        return fileName != null ? fileName.toString() : path;
    }

    private static final Pattern ROOT_NAME_PATTERN = Pattern.compile("^(.*)_([0-9]{2}_[0-9]{2})$");

    private static String extractMessageName(String bindingName) {
        Matcher matcher = ROOT_NAME_PATTERN.matcher(bindingName);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return bindingName;
    }

    private static Optional<String> extractMessageVersion(String bindingName) {
        Matcher matcher = ROOT_NAME_PATTERN.matcher(bindingName);
        if (matcher.matches()) {
            return Optional.of(matcher.group(2));
        }
        return Optional.empty();
    }

    private DictionaryEntry resolveMessageDefinition(String pipType, String messageVersion, String messageName) {
        List<DictionaryEntry> matches = new ArrayList<>();
        for (DictionaryEntry entry : DICTIONARY) {
            if (!pipType.equals(entry.type())) {
                continue;
            }
            if (!messageName.equals(entry.name())) {
                continue;
            }
            matches.add(entry);
        }

        assertThat(matches)
            .as("Dictionary should locate %s (%s)", pipType, messageName)
            .isNotEmpty();

        if (messageVersion != null && !messageVersion.isBlank()) {
            for (DictionaryEntry entry : matches) {
                if (messageVersion.equals(entry.version())) {
                    return entry;
                }
            }
        }

        DictionaryEntry latest = matches.get(0);
        for (DictionaryEntry entry : matches) {
            if (parseVersion(entry.version()) > parseVersion(latest.version())) {
                latest = entry;
            }
        }
        return latest;
    }

    private JAXBContext createJaxbContext(DictionaryEntry definition) throws JAXBException {
        Properties properties = loadProperties(definition.properties());
        String contextPath = properties.getProperty("packages");

        assertThat(contextPath)
            .as("RosettaNet properties should declare JAXB packages for %s", definition.type())
            .isNotBlank();
        assertThat(contextPath)
            .as("JAXB package list should include the message package %s", definition.packageName())
            .contains(definition.packageName());

        JAXBContext context = JAXBContext.newInstance(contextPath.trim());
        assertThat(context).isNotNull();
        JAXBElement<?> rootElement = instantiateRootElement(definition);
        assertThat(context.createJAXBIntrospector().isElement(rootElement))
            .as("Context should recognise %s element", definition.name())
            .isTrue();
        return context;
    }

    private JAXBElement<?> unmarshalPayload(JAXBContext jaxbContext, String xmlPayload) throws JAXBException {
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object unmarshalled = unmarshaller.unmarshal(new StreamSource(new java.io.StringReader(xmlPayload)));
        assertThat(unmarshalled)
            .as("JAXB unmarshal result should be a JAXBElement")
            .isInstanceOf(JAXBElement.class);
        return (JAXBElement<?>) unmarshalled;
    }

    private String marshalPayload(JAXBContext jaxbContext, JAXBElement<?> jaxbElement) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        StringWriter writer = new StringWriter();
        marshaller.marshal(jaxbElement, writer);
        return writer.toString();
    }

    private static JAXBElement<?> instantiateRootElement(DictionaryEntry definition) {
        try {
            Class<?> elementClass = resolveMessageClass(definition);
            return (JAXBElement<?>) elementClass.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                 | NoSuchMethodException | InvocationTargetException ex) {
            throw new IllegalStateException("Unable to instantiate JAXB element for " + definition.name(), ex);
        }
    }

    private static Class<?> resolveMessageClass(DictionaryEntry definition) throws ClassNotFoundException {
        return Class.forName(definition.packageName() + "." + definition.name());
    }

    private Class<?> resolveMessageValueClass(DictionaryEntry definition) {
        JAXBElement<?> element = instantiateRootElement(definition);
        return element.getDeclaredType();
    }

    private String readSample(Path samplePath) throws IOException {
        Path absolute = samplePath.toAbsolutePath();
        if (!Files.exists(absolute)) {
            throw new IOException("Sample resource not found: " + absolute);
        }
        return new String(Files.readAllBytes(absolute), StandardCharsets.UTF_8);
    }
}
