
package io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentModeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:1.0", "ShipmentModeA");

    public ShipmentModeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipmentModeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
