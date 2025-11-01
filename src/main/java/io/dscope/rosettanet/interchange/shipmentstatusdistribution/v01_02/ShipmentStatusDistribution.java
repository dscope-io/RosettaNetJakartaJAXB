
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v01_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShipmentStatusDistribution", namespace = "urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02")
public class ShipmentStatusDistribution
    extends JAXBElement<ShipmentStatusDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02", "ShipmentStatusDistribution");

    public ShipmentStatusDistribution(ShipmentStatusDistributionType value) {
        super(NAME, ((Class) ShipmentStatusDistributionType.class), null, value);
    }

    public ShipmentStatusDistribution() {
        super(NAME, ((Class) ShipmentStatusDistributionType.class), null, null);
    }

}
