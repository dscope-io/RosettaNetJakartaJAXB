
package io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentModeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.04", "ShipmentModeA");

    public ShipmentModeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipmentModeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
