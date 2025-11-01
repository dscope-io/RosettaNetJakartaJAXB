
package io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "InventoryReportDistribution", namespace = "urn:rosettanet:specification:interchange:InventoryReportDistribution:xsd:schema:02.02")
public class InventoryReportDistribution
    extends JAXBElement<InventoryReportDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:InventoryReportDistribution:xsd:schema:02.02", "InventoryReportDistribution");

    public InventoryReportDistribution(InventoryReportDistributionType value) {
        super(NAME, ((Class) InventoryReportDistributionType.class), null, value);
    }

    public InventoryReportDistribution() {
        super(NAME, ((Class) InventoryReportDistributionType.class), null, null);
    }

}
