
package io.dscope.rosettanet.domain.procurement.codelist.productavailabilitycode.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductAvailabilityCode
    extends JAXBElement<ProductAvailabilityCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03", "ProductAvailabilityCode");

    public ProductAvailabilityCode(ProductAvailabilityCodeType value) {
        super(NAME, ((Class) ProductAvailabilityCodeType.class), null, value);
    }

    public ProductAvailabilityCode() {
        super(NAME, ((Class) ProductAvailabilityCodeType.class), null, null);
    }

}
