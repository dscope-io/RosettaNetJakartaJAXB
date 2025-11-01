
package io.dscope.rosettanet.domain.design.codelist.messagefunction.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MessageFunctionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00", "MessageFunctionA");

    public MessageFunctionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public MessageFunctionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
