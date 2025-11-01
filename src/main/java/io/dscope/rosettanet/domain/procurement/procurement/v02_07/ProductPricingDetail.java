
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductPricingDetail
    extends JAXBElement<ProductPricingDetailType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", "ProductPricingDetail");

    public ProductPricingDetail(ProductPricingDetailType value) {
        super(NAME, ((Class) ProductPricingDetailType.class), null, value);
    }

    public ProductPricingDetail() {
        super(NAME, ((Class) ProductPricingDetailType.class), null, null);
    }

}
