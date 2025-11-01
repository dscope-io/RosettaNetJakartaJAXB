
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ProductQualityEventDataDistribution", namespace = "urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00")
public class ProductQualityEventDataDistribution
    extends JAXBElement<ProductQualityEventDataDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00", "ProductQualityEventDataDistribution");

    public ProductQualityEventDataDistribution(ProductQualityEventDataDistributionType value) {
        super(NAME, ((Class) ProductQualityEventDataDistributionType.class), null, value);
    }

    public ProductQualityEventDataDistribution() {
        super(NAME, ((Class) ProductQualityEventDataDistributionType.class), null, null);
    }

}
