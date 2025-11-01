
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureEvent
    extends JAXBElement<FailureEventType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "FailureEvent");

    public FailureEvent(FailureEventType value) {
        super(NAME, ((Class) FailureEventType.class), null, value);
    }

    public FailureEvent() {
        super(NAME, ((Class) FailureEventType.class), null, null);
    }

}
