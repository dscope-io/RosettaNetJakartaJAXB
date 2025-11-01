
package io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransportEventA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:1.0", "TransportEventA");

    public TransportEventA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TransportEventA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
