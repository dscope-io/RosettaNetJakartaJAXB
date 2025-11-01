
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ProductMasterDistribution", namespace = "urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00")
public class ProductMasterDistribution
    extends JAXBElement<ProductMasterDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00", "ProductMasterDistribution");

    public ProductMasterDistribution(ProductMasterDistributionType value) {
        super(NAME, ((Class) ProductMasterDistributionType.class), null, value);
    }

    public ProductMasterDistribution() {
        super(NAME, ((Class) ProductMasterDistributionType.class), null, null);
    }

}
