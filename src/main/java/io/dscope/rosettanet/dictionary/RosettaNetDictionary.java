package io.dscope.rosettanet.dictionary;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Utility for resolving RosettaNet message metadata from the bundled dictionary.
 */
public final class RosettaNetDictionary {

    private static final String DICTIONARY_RESOURCE = "/RosettaNet_Dictionary.xml";
    private static final Comparator<MessageDefinition> VERSION_ORDER = Comparator.comparingInt(
        definition -> parseVersion(definition.getVersion())
    );

    private static final List<MessageDefinition> DEFINITIONS = loadDefinitions();

    private RosettaNetDictionary() {
        // Utility class
    }

    /**
     * Finds the dictionary entry for the requested RosettaNet PIP message.
     *
     * @param pipType the PIP identifier (for example {@code PIP3A4})
     * @param version the target message version (for example {@code 02_05}), optional
     * @param messageName the RosettaNet message name (for example {@code PurchaseOrderRequest}), optional
     * @return the resolved dictionary entry when found
     */
    public static Optional<MessageDefinition> findMessage(String pipType, String version, String messageName) {
        Objects.requireNonNull(pipType, "pipType");
        List<MessageDefinition> matches = new ArrayList<>();
        for (MessageDefinition definition : DEFINITIONS) {
            if (!pipType.equalsIgnoreCase(definition.getType())) {
                continue;
            }
            if (messageName != null && !messageName.isEmpty()
                && !messageName.equalsIgnoreCase(definition.getName())) {
                continue;
            }
            matches.add(definition);
        }

        if (matches.isEmpty()) {
            return Optional.empty();
        }

        if (version != null && !version.isEmpty()) {
            for (MessageDefinition definition : matches) {
                if (version.equals(definition.getVersion())) {
                    return Optional.of(definition);
                }
            }
        }

        return Optional.of(selectLatest(matches));
    }

    /**
     * Loads the RosettaNet properties file that corresponds to the provided dictionary entry.
     *
     * @param propertiesFile the properties file name from the dictionary entry
     * @return the loaded properties
     */
    public static Properties loadProperties(String propertiesFile) {
        Objects.requireNonNull(propertiesFile, "propertiesFile");
        String resourcePath = propertiesFile.startsWith("/") ? propertiesFile : "/" + propertiesFile;
        try (InputStream inputStream = RosettaNetDictionary.class.getResourceAsStream(resourcePath)) {
            if (inputStream == null) {
                throw new IllegalStateException("RosettaNet properties file not found on the classpath: " + resourcePath);
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (IOException ex) {
            throw new UncheckedIOException("Unable to load RosettaNet properties: " + resourcePath, ex);
        }
    }

    private static MessageDefinition selectLatest(List<MessageDefinition> definitions) {
        return Collections.max(definitions, VERSION_ORDER);
    }

    public static List<MessageDefinition> loadDefinitions() {
        try (InputStream inputStream = RosettaNetDictionary.class.getResourceAsStream(DICTIONARY_RESOURCE)) {
            if (inputStream == null) {
                throw new IllegalStateException("RosettaNet dictionary not found on the classpath: " + DICTIONARY_RESOURCE);
            }
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(false);
            enableSecureProcessing(factory);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            NodeList nodes = document.getElementsByTagName("message");
            List<MessageDefinition> definitions = new ArrayList<>(nodes.getLength());
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                if (node.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                Element element = (Element) node;
                String name = element.getAttribute("name");
                String packageName = element.getAttribute("package");
                String properties = element.getAttribute("properties");
                String type = element.getAttribute("type");
                String version = element.getAttribute("version");
                definitions.add(new MessageDefinition(name, packageName, properties, type, version));
            }
            return Collections.unmodifiableList(definitions);
        } catch (ParserConfigurationException | SAXException ex) {
            throw new IllegalStateException("Unable to parse RosettaNet dictionary", ex);
        } catch (IOException ex) {
            throw new UncheckedIOException("Unable to read RosettaNet dictionary", ex);
        }
    }

    private static void enableSecureProcessing(DocumentBuilderFactory factory) throws ParserConfigurationException {
        factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        factory.setExpandEntityReferences(false);
    }

    private static int parseVersion(String version) {
        if (version == null || version.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        String numeric = version.replaceAll("[^0-9]", "");
        if (numeric.isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(numeric);
    }

    /**
     * Immutable view of a RosettaNet dictionary entry.
     */
    public static final class MessageDefinition {
        private final String name;
        private final String packageName;
        private final String properties;
        private final String type;
        private final String version;

        private MessageDefinition(String name, String packageName, String properties, String type, String version) {
            this.name = name;
            this.packageName = packageName;
            this.properties = properties;
            this.type = type;
            this.version = version;
        }

        public String getName() {
            return name;
        }

        public String getPackageName() {
            return packageName;
        }

        public String getProperties() {
            return properties;
        }

        public String getType() {
            return type;
        }

        public String getVersion() {
            return version;
        }
    }
}
