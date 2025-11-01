
package io.dscope.rosettanet.domain.procurement.procurement.v02_06;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductDistribution
    extends JAXBElement<ProductDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.06", "ProductDistribution");

    public ProductDistribution(ProductDistributionType value) {
        super(NAME, ((Class) ProductDistributionType.class), null, value);
    }

    public ProductDistribution() {
        super(NAME, ((Class) ProductDistributionType.class), null, null);
    }

}
