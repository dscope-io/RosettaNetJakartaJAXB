package io.dscope.samples.pip3a4;

import java.io.StringReader;
import java.util.Optional;
import java.util.Properties;

import javax.xml.transform.stream.StreamSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import io.dscope.rosettanet.dictionary.RosettaNetDictionary;
import io.dscope.rosettanet.dictionary.RosettaNetDictionary.MessageDefinition;
import io.dscope.rosettanet.interchange.purchaseorderrequest.v02_05.PurchaseOrderRequestType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Unmarshaller;

class PurchaseOrderRequestDemoTest {

    private static final String PIP_TYPE = "PIP3A4";
    private static final String MESSAGE_VERSION = "02_05";
    private static final String MESSAGE_NAME = "PurchaseOrderRequest";

    @Test
    void roundTripSamplePayload() throws Exception {
        PurchaseOrderRequestDemo demo = new PurchaseOrderRequestDemo();

        PurchaseOrderRequestType request = demo.readSample();
        assertNotNull(request, "Expected sample payload to unmarshal");

        String marshalled = demo.marshal(request);
        assertThat(marshalled)
            .as("Marshalled XML should include the %s root element", MESSAGE_NAME)
            .contains(MESSAGE_NAME);

        MessageDefinition messageDefinition = resolveMessageDefinition();
        String contextPath = resolveContextPath(messageDefinition);

        JAXBContext context = JAXBContext.newInstance(contextPath);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        JAXBElement<PurchaseOrderRequestType> roundTripped = unmarshaller.unmarshal(
            new StreamSource(new StringReader(marshalled)),
            PurchaseOrderRequestType.class
        );

        assertThat(roundTripped.getName().getLocalPart()).isEqualTo(MESSAGE_NAME);
        assertThat(roundTripped.getValue().getPurchaseOrder())
            .as("Round-tripped payload should retain purchase order content")
            .isNotNull();
    }

    private MessageDefinition resolveMessageDefinition() {
        Optional<MessageDefinition> definition = RosettaNetDictionary.findMessage(PIP_TYPE, MESSAGE_VERSION, MESSAGE_NAME);
        assertThat(definition)
            .as("Dictionary should provide an entry for %s %s (%s)", PIP_TYPE, MESSAGE_VERSION, MESSAGE_NAME)
            .isPresent();
        return definition.get();
    }

    private String resolveContextPath(MessageDefinition definition) {
        Properties properties = RosettaNetDictionary.loadProperties(definition.getProperties());
        String contextPath = properties.getProperty("packages");
        assertThat(contextPath)
            .as("RosettaNet properties should declare JAXB packages for %s", definition.getType())
            .isNotBlank();
        return contextPath.trim();
    }
}
