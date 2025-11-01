
package io.dscope.rosettanet.domain.logistics.logistics.v02_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentChangeReason
    extends JAXBElement<ShipmentChangeReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", "ShipmentChangeReason");

    public ShipmentChangeReason(ShipmentChangeReasonType value) {
        super(NAME, ((Class) ShipmentChangeReasonType.class), null, value);
    }

    public ShipmentChangeReason() {
        super(NAME, ((Class) ShipmentChangeReasonType.class), null, null);
    }

}
