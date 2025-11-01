
package io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentChangeDispositionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:1.0", "ShipmentChangeDispositionA");

    public ShipmentChangeDispositionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipmentChangeDispositionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
