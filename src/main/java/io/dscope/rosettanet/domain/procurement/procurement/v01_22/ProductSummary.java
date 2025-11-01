
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductSummary
    extends JAXBElement<ProductSummaryType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", "ProductSummary");

    public ProductSummary(ProductSummaryType value) {
        super(NAME, ((Class) ProductSummaryType.class), null, value);
    }

    public ProductSummary() {
        super(NAME, ((Class) ProductSummaryType.class), null, null);
    }

}
