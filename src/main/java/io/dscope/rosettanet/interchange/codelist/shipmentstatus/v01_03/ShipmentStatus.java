
package io.dscope.rosettanet.interchange.codelist.shipmentstatus.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentStatus
    extends JAXBElement<ShipmentStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipmentStatus:xsd:codelist:01.03", "ShipmentStatus");

    public ShipmentStatus(ShipmentStatusType value) {
        super(NAME, ((Class) ShipmentStatusType.class), null, value);
    }

    public ShipmentStatus() {
        super(NAME, ((Class) ShipmentStatusType.class), null, null);
    }

}
