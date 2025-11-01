
package io.dscope.rosettanet.domain.procurement.codelist.event.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Event
    extends JAXBElement<EventType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00", "Event");

    public Event(EventType value) {
        super(NAME, ((Class) EventType.class), null, value);
    }

    public Event() {
        super(NAME, ((Class) EventType.class), null, null);
    }

}
