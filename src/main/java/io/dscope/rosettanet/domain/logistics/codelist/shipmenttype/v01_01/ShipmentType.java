
package io.dscope.rosettanet.domain.logistics.codelist.shipmenttype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentType
    extends JAXBElement<ShipmentTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.01", "ShipmentType");

    public ShipmentType(ShipmentTypeType value) {
        super(NAME, ((Class) ShipmentTypeType.class), null, value);
    }

    public ShipmentType() {
        super(NAME, ((Class) ShipmentTypeType.class), null, null);
    }

}
