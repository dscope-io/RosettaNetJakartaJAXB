
package io.dscope.rosettanet.domain.service.service.v02_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MessageInformation
    extends JAXBElement<MessageInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.14", "MessageInformation");

    public MessageInformation(MessageInformationType value) {
        super(NAME, ((Class) MessageInformationType.class), null, value);
    }

    public MessageInformation() {
        super(NAME, ((Class) MessageInformationType.class), null, null);
    }

}
