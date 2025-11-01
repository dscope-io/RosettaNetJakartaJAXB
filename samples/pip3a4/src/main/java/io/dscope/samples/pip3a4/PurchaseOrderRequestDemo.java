package io.dscope.samples.pip3a4;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.dscope.rosettanet.dictionary.RosettaNetDictionary;
import io.dscope.rosettanet.dictionary.RosettaNetDictionary.MessageDefinition;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.OrderQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.OrderQuantityType;
import io.dscope.rosettanet.interchange.purchaseorderrequest.v02_05.OrderLineItemType;
import io.dscope.rosettanet.interchange.purchaseorderrequest.v02_05.ProductLineItemType;
import io.dscope.rosettanet.interchange.purchaseorderrequest.v02_05.PurchaseOrderRequest;
import io.dscope.rosettanet.interchange.purchaseorderrequest.v02_05.PurchaseOrderRequestType;
import io.dscope.rosettanet.interchange.purchaseorderrequest.v02_05.PurchaseOrderType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentHeader;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentHeaderType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentIdentificationType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentInformationType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.StandardDocumentIdentificationType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

/**
 * Simple command line demo that round-trips the RosettaNet PIP3A4 Purchase
 * Order Request.
 */
public final class PurchaseOrderRequestDemo {

    private static final String SAMPLE_RESOURCE = "/samples/pip3a4/PurchaseOrderRequest.xml";
    private static final String PIP_TYPE = "PIP3A4";
    private static final String MESSAGE_VERSION = "02_05";
    private static final String MESSAGE_NAME = "PurchaseOrderRequest";
    private static final DateTimeFormatter IDENTIFIER_FORMAT = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseOrderRequestDemo.class);

    private final JAXBContext jaxbContext;
    private final DatatypeFactory datatypeFactory;

    public PurchaseOrderRequestDemo() {
        try {
            this.jaxbContext = createJaxbContext();
            this.datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException | JAXBException ex) {
            throw new IllegalStateException("Failed to configure demo infrastructure", ex);
        }
    }

    public static void main(String[] args) {
        try {
            PurchaseOrderRequestDemo demo = new PurchaseOrderRequestDemo();
            LOGGER.info("Reading canonical PIP3A4 sample payload");
            PurchaseOrderRequestType payload = demo.readSample();

            String newIdentifier = "PO-DEMO-" + IDENTIFIER_FORMAT.format(OffsetDateTime.now(ZoneOffset.UTC));
            demo.updateDocumentIdentifier(payload, newIdentifier);
            float updatedQuantity = demo.bumpFirstLineItemQuantity(payload, 5.0f);

            String xml = demo.marshal(payload);
            Path output = demo.writeOutput(xml);

            LOGGER.info("Updated document identifier to {}", newIdentifier);
            LOGGER.info("First requested quantity bumped to {}", updatedQuantity);
            LOGGER.info("Marshalled XML written to {}", output.toAbsolutePath());
        } catch (Exception ex) {
            LOGGER.error("PIP3A4 demo execution failed: {}", ex.getMessage(), ex);
            System.exit(1);
        }
    }

    private JAXBContext createJaxbContext() throws JAXBException {
        Optional<MessageDefinition> definition = RosettaNetDictionary.findMessage(PIP_TYPE, MESSAGE_VERSION, MESSAGE_NAME);
        MessageDefinition messageDefinition = definition.orElseThrow(()
                -> new IllegalStateException("RosettaNet dictionary does not contain an entry for " + PIP_TYPE
                        + " version " + MESSAGE_VERSION + " (" + MESSAGE_NAME + ")")
        );

        Properties properties = RosettaNetDictionary.loadProperties(messageDefinition.getProperties());

        String propertiesSource = messageDefinition.getProperties();

        String contextPath = properties.getProperty("packages");
        if (contextPath == null || contextPath.trim().isEmpty()) {
            throw new IllegalStateException("Resolved RosettaNet properties do not define a 'packages' entry");
        }
        contextPath = contextPath.trim();

        LOGGER.info("Using RosettaNet JAXB context properties from {}", propertiesSource);
        LOGGER.info("Resolved JAXB package context:\n{}", contextPath.replace(':', '\n'));
        LOGGER.info("Resolved JAXB context for {} {}", PIP_TYPE, MESSAGE_VERSION);
        return JAXBContext.newInstance(contextPath);
    }

    /**
     * Reads the sample XML payload and unmarshals it into the generated JAXB
     * model.
     */
    public PurchaseOrderRequestType readSample() {
        try (InputStream inputStream = PurchaseOrderRequestDemo.class.getResourceAsStream(SAMPLE_RESOURCE)) {
            if (inputStream == null) {
                throw new IllegalStateException("Could not find sample payload on the classpath: " + SAMPLE_RESOURCE);
            }
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            PurchaseOrderRequest po = (PurchaseOrderRequest) unmarshaller.unmarshal(new StreamSource(inputStream));

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            LOGGER.info("Unmarshalled PurchaseOrderRequest sample payload:\n");
            marshaller.marshal(po, System.out);

            PurchaseOrderRequestType value = po.getValue();

            if (value == null) {
                throw new IllegalStateException("PurchaseOrderRequestType value was null in sample payload");
            }

            return value;
        } catch (JAXBException ex) {
            throw new IllegalStateException("Failed to unmarshal PIP3A4 sample payload", ex);
        } catch (IOException ex) {
            throw new UncheckedIOException("Failed to read sample payload", ex);
        }
    }

    /**
     * Updates the document header by setting a new identifier and refreshing
     * the creation timestamp.
     */
    public void updateDocumentIdentifier(PurchaseOrderRequestType request, String newIdentifier) {
        DocumentHeader headerElement = request.getDocumentHeader();
        DocumentHeaderType header = unwrap(headerElement);
        if (header == null) {
            return;
        }

        DocumentInformationType information = unwrap(header.getDocumentInformation());
        if (information != null) {
            information.setCreation(currentTimestamp());

            DocumentIdentificationType identification = unwrap(information.getDocumentIdentification());
            if (identification != null) {
                identification.setIdentifier(newIdentifier);

                StandardDocumentIdentificationType standard = unwrap(identification.getStandardDocumentIdentification());
                if (standard != null && standard.getVersion() != null) {
                    standard.setVersion(standard.getVersion() + "-DEMO");
                }
            }
        }

        header.setHeaderVersion("1.1");
    }

    /**
     * Adds {@code delta} units to the requested quantity of the first product
     * line item.
     */
    public float bumpFirstLineItemQuantity(PurchaseOrderRequestType request, float delta) {
        PurchaseOrderType purchaseOrder = request.getPurchaseOrder();
        if (purchaseOrder == null) {
            throw new IllegalStateException("PurchaseOrder section is missing");
        }

        List<OrderLineItemType> items = purchaseOrder.getOrderLineItem();
        if (items.isEmpty()) {
            throw new IllegalStateException("No order line items present in the purchase order");
        }

        OrderLineItemType firstItem = items.get(0);
        ProductLineItemType productLineItem = firstItem.getProductLineItem();
        if (productLineItem == null) {
            throw new IllegalStateException("First line item does not contain a product line item");
        }

        OrderQuantity quantityElement = productLineItem.getOrderQuantity();
        OrderQuantityType quantity = unwrap(quantityElement);
        if (quantity == null) {
            throw new IllegalStateException("Product line item is missing the OrderQuantity element");
        }

        float updated = quantity.getRequestedQuantity() + delta;
        quantity.setRequestedQuantity(updated);
        return updated;
    }

    /**
     * Marshals the updated JAXB model back into XML.
     */
    public String marshal(PurchaseOrderRequestType request) {
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter writer = new StringWriter();
            marshaller.marshal(new PurchaseOrderRequest(request), writer);
            return writer.toString();
        } catch (JAXBException ex) {
            throw new IllegalStateException("Failed to marshal PurchaseOrderRequest", ex);
        }
    }

    /**
     * Writes the marshalled XML to
     * {@code build/samples/pip3a4-purchase-order-request.xml}.
     */
    public Path writeOutput(String xml) {
        try {
            Path targetDirectory = Paths.get("build", "samples");
            Files.createDirectories(targetDirectory);
            Path output = targetDirectory.resolve("pip3a4-purchase-order-request.xml");
            Files.write(output, xml.getBytes(StandardCharsets.UTF_8));
            return output;
        } catch (IOException ex) {
            throw new UncheckedIOException("Failed to write marshalled XML", ex);
        }
    }

    private XMLGregorianCalendar currentTimestamp() {
        return datatypeFactory.newXMLGregorianCalendar(OffsetDateTime.now(ZoneOffset.UTC).toString());
    }

    private <T> T unwrap(JAXBElement<T> element) {
        return element != null ? element.getValue() : null;
    }
}
