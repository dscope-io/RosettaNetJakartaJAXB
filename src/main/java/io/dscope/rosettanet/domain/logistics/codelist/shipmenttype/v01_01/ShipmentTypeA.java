
package io.dscope.rosettanet.domain.logistics.codelist.shipmenttype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.01", "ShipmentTypeA");

    public ShipmentTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipmentTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
