
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestedEvent
    extends JAXBElement<RequestedEventType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "RequestedEvent");

    public RequestedEvent(RequestedEventType value) {
        super(NAME, ((Class) RequestedEventType.class), null, value);
    }

    public RequestedEvent() {
        super(NAME, ((Class) RequestedEventType.class), null, null);
    }

}
