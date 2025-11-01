
package io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderStatusDistribution", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01")
public class PurchaseOrderStatusDistribution
    extends JAXBElement<PurchaseOrderStatusDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01", "PurchaseOrderStatusDistribution");

    public PurchaseOrderStatusDistribution(PurchaseOrderStatusDistributionType value) {
        super(NAME, ((Class) PurchaseOrderStatusDistributionType.class), null, value);
    }

    public PurchaseOrderStatusDistribution() {
        super(NAME, ((Class) PurchaseOrderStatusDistributionType.class), null, null);
    }

}
