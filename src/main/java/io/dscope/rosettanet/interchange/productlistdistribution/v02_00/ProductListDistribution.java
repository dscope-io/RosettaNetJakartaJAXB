
package io.dscope.rosettanet.interchange.productlistdistribution.v02_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ProductListDistribution", namespace = "urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00")
public class ProductListDistribution
    extends JAXBElement<ProductListDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00", "ProductListDistribution");

    public ProductListDistribution(ProductListDistributionType value) {
        super(NAME, ((Class) ProductListDistributionType.class), null, value);
    }

    public ProductListDistribution() {
        super(NAME, ((Class) ProductListDistributionType.class), null, null);
    }

}
