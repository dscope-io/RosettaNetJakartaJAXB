
package io.dscope.rosettanet.domain.design.codelist.messagefunction.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MessageFunction
    extends JAXBElement<MessageFunctionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00", "MessageFunction");

    public MessageFunction(MessageFunctionType value) {
        super(NAME, ((Class) MessageFunctionType.class), null, value);
    }

    public MessageFunction() {
        super(NAME, ((Class) MessageFunctionType.class), null, null);
    }

}
