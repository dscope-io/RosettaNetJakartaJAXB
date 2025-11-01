package io.dscope.samples.pip3c3;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
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
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.InvoiceAmountType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.SpecifiedBusinessDocumentReferenceType;
import io.dscope.rosettanet.interchange.invoicenotification.v02_05.AmountType;
import io.dscope.rosettanet.interchange.invoicenotification.v02_05.InvoiceLineItemType;
import io.dscope.rosettanet.interchange.invoicenotification.v02_05.InvoiceNotification;
import io.dscope.rosettanet.interchange.invoicenotification.v02_05.InvoiceNotificationType;
import io.dscope.rosettanet.interchange.invoicenotification.v02_05.InvoiceType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentHeader;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentHeaderType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentIdentificationType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentInformationType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.StandardDocumentIdentificationType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmount;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

/**
 * Command line demo that round-trips the RosettaNet PIP3C3 Invoice Notification sample payload.
 */
public final class InvoiceNotificationDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceNotificationDemo.class);
    private static final String SAMPLE_RESOURCE = "/samples/pip3c3/InvoiceNotification.xml";
    private static final String PIP_TYPE = "PIP3C3";
    private static final String MESSAGE_VERSION = "02_05";
    private static final String MESSAGE_NAME = "InvoiceNotification";
    private static final DateTimeFormatter IDENTIFIER_FORMAT = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    private final JAXBContext jaxbContext;
    private final DatatypeFactory datatypeFactory;

    public InvoiceNotificationDemo() {
        try {
            this.jaxbContext = createJaxbContext();
            this.datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException | JAXBException ex) {
            throw new IllegalStateException("Failed to configure demo infrastructure", ex);
        }
    }

    public static void main(String[] args) {
        try {
            InvoiceNotificationDemo demo = new InvoiceNotificationDemo();
            LOGGER.info("Reading canonical PIP3C3 sample payload");
            InvoiceNotificationType notification = demo.readSample();
            InvoiceType invoice = notification.getInvoice();

            String documentIdentifier = demo.generateIdentifier("INV-DEMO-");
            demo.refreshDocumentHeader(notification, documentIdentifier);

            String purchaseOrderIdentifier = demo.generateIdentifier("PO-DEMO-");
            demo.updatePurchaseOrderReference(invoice, purchaseOrderIdentifier);

            float updatedLineTotal = demo.bumpFirstLineItemAmount(invoice, 25.0f);
            demo.updateInvoiceTotals(invoice);

            String xml = demo.marshal(notification);
            Path output = demo.writeOutput(xml);

            LOGGER.info("Document identifier refreshed to {}", documentIdentifier);
            LOGGER.info("Purchase order reference set to {}", purchaseOrderIdentifier);
            LOGGER.info("First line-item total increased to {}", updatedLineTotal);
            LOGGER.info("Marshalled XML written to {}", output.toAbsolutePath());
        } catch (Exception ex) {
            LOGGER.error("PIP3C3 demo execution failed: {}", ex.getMessage(), ex);
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


    public InvoiceNotificationType readSample() {
        try (InputStream inputStream = InvoiceNotificationDemo.class.getResourceAsStream(SAMPLE_RESOURCE)) {
            if (inputStream == null) {
                throw new IllegalStateException("Could not find sample payload on the classpath: " + SAMPLE_RESOURCE);
            }
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            InvoiceNotification invoiceNotification = (InvoiceNotification) unmarshaller.unmarshal(new StreamSource(inputStream));

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            LOGGER.info("Unmarshalled InvoiceNotification sample payload:\n");
            marshaller.marshal(invoiceNotification, System.out);

            InvoiceNotificationType value = invoiceNotification.getValue();
            if (value == null) {
                throw new IllegalStateException("InvoiceNotificationType value was null in sample payload");
            }
            return value;
        } catch (JAXBException ex) {
            throw new IllegalStateException("Failed to unmarshal PIP3C3 sample payload", ex);
        } catch (IOException ex) {
            throw new UncheckedIOException("Failed to read sample payload", ex);
        }
    }

    public void refreshDocumentHeader(InvoiceNotificationType notification, String newIdentifier) {
        DocumentHeader headerElement = notification.getDocumentHeader();
        DocumentHeaderType header = unwrap(headerElement);
        if (header == null) {
            LOGGER.warn("InvoiceNotification did not contain a document header");
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

    public void updatePurchaseOrderReference(InvoiceType invoice, String identifier) {
        SpecifiedBusinessDocumentReferenceType purchaseOrder = invoice.getPurchaseOrderNumber();
        if (purchaseOrder == null) {
            purchaseOrder = new SpecifiedBusinessDocumentReferenceType();
            invoice.setPurchaseOrderNumber(purchaseOrder);
        }

        purchaseOrder.setIdentifier(identifier);
        purchaseOrder.setRevision("DEMO");
        purchaseOrder.setDateTime(currentTimestamp());
    }

    public float bumpFirstLineItemAmount(InvoiceType invoice, float delta) {
        List<InvoiceLineItemType> items = invoice.getInvoiceLineItem();
        if (items.isEmpty()) {
            throw new IllegalStateException("No invoice line items present");
        }

        InvoiceLineItemType firstItem = items.get(0);
        AmountType totalAmount = Objects.requireNonNull(firstItem.getTotalLineItemAmount(),
                "Invoice line item is missing the total amount");

        float updatedTotal = adjustAmount(totalAmount, delta,
                "Invoice line item total amount (line " + firstItem.getLineNumber() + ")");

        AmountType preTaxAmount = firstItem.getPreTaxAmount();
        if (preTaxAmount != null) {
            adjustAmount(preTaxAmount, delta,
                    "Invoice line item pre-tax amount (line " + firstItem.getLineNumber() + ")");
        }

        return updatedTotal;
    }

    public void updateInvoiceTotals(InvoiceType invoice) {
        List<InvoiceLineItemType> items = invoice.getInvoiceLineItem();
        invoice.setTotalNumberOfItems(BigInteger.valueOf(items.size()));

        double total = 0.0d;
        double preTaxTotal = 0.0d;

        for (InvoiceLineItemType item : items) {
            AmountType lineTotal = Objects.requireNonNull(item.getTotalLineItemAmount(),
                    "Invoice line item is missing the total amount");
            total += readAmount(lineTotal,
                    "Invoice line item total amount (line " + item.getLineNumber() + ")");

            AmountType linePreTax = item.getPreTaxAmount();
            if (linePreTax != null) {
                preTaxTotal += readAmount(linePreTax,
                        "Invoice line item pre-tax amount (line " + item.getLineNumber() + ")");
            }
        }

        for (InvoiceAmountType ancillary : invoice.getAncillaryAmount()) {
            total += readAmount(ancillary, "Invoice ancillary amount");
        }

        setAmount(invoice.getTotalInvoiceAmount(), (float) total, "Invoice total amount");
        AmountType invoicePreTax = invoice.getPreTaxAmount();
        if (invoicePreTax != null && preTaxTotal > 0.0d) {
            setAmount(invoicePreTax, (float) preTaxTotal, "Invoice pre-tax amount");
        }
    }

    public String marshal(InvoiceNotificationType notification) {
        try {
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            StringWriter writer = new StringWriter();
            marshaller.marshal(new InvoiceNotification(notification), writer);
            return writer.toString();
        } catch (JAXBException ex) {
            throw new IllegalStateException("Failed to marshal InvoiceNotification", ex);
        }
    }

    public Path writeOutput(String xml) {
        try {
            Path targetDirectory = Paths.get("build", "samples");
            Files.createDirectories(targetDirectory);
            Path output = targetDirectory.resolve("pip3c3-invoice-notification.xml");
            Files.write(output, xml.getBytes(StandardCharsets.UTF_8));
            return output;
        } catch (IOException ex) {
            throw new UncheckedIOException("Failed to write marshalled XML", ex);
        }
    }

    private float adjustAmount(AmountType amount, float delta, String context) {
        float current = readAmount(amount, context);
        float updated = current + delta;
        setAmount(amount, updated, context);
        return updated;
    }

    private float readAmount(AmountType amount, String context) {
        FinancialAmountType financialAmount = requireFinancialAmount(amount != null ? amount.getFinancialAmount() : null,
                context);
        return financialAmount.getAmount();
    }

    private float readAmount(InvoiceAmountType amount, String context) {
        FinancialAmountType financialAmount = requireFinancialAmount(
                amount != null ? amount.getFinancialAmount() : null, context);
        return financialAmount.getAmount();
    }

    private void setAmount(AmountType amount, float value, String context) {
        FinancialAmountType financialAmount = requireFinancialAmount(amount != null ? amount.getFinancialAmount() : null,
                context);
        financialAmount.setAmount(value);
    }

    private FinancialAmountType requireFinancialAmount(FinancialAmount element, String context) {
        if (element == null) {
            throw new IllegalStateException(context + " is missing the FinancialAmount element");
        }
        FinancialAmountType value = unwrap(element);
        if (value == null) {
            throw new IllegalStateException(context + " has a null FinancialAmount value");
        }
        return value;
    }

    private XMLGregorianCalendar currentTimestamp() {
        return datatypeFactory.newXMLGregorianCalendar(OffsetDateTime.now(ZoneOffset.UTC).toString());
    }

    private String generateIdentifier(String prefix) {
        return prefix + IDENTIFIER_FORMAT.format(OffsetDateTime.now(ZoneOffset.UTC));
    }

    private <T> T unwrap(JAXBElement<T> element) {
        return element != null ? element.getValue() : null;
    }
}
