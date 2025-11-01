
package io.dscope.rosettanet.domain.shared.shared.v01_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductPricing
    extends JAXBElement<ProductPricingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.19", "ProductPricing");

    public ProductPricing(ProductPricingType value) {
        super(NAME, ((Class) ProductPricingType.class), null, value);
    }

    public ProductPricing() {
        super(NAME, ((Class) ProductPricingType.class), null, null);
    }

}
