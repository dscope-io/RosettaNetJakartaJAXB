
package io.dscope.rosettanet.domain.logistics.logistics.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentServiceLevel
    extends JAXBElement<ShipmentServiceLevelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", "ShipmentServiceLevel");

    public ShipmentServiceLevel(ShipmentServiceLevelType value) {
        super(NAME, ((Class) ShipmentServiceLevelType.class), null, value);
    }

    public ShipmentServiceLevel() {
        super(NAME, ((Class) ShipmentServiceLevelType.class), null, null);
    }

}
