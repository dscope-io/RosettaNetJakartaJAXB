
package io.dscope.rosettanet.domain.procurement.codelist.event.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class EventA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00", "EventA");

    public EventA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public EventA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
