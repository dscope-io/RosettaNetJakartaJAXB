
package io.dscope.rosettanet.domain.logistics.codelist.productquantitytype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductQuantityType
    extends JAXBElement<ProductQuantityTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ProductQuantityType:xsd:codelist:01.00", "ProductQuantityType");

    public ProductQuantityType(ProductQuantityTypeType value) {
        super(NAME, ((Class) ProductQuantityTypeType.class), null, value);
    }

    public ProductQuantityType() {
        super(NAME, ((Class) ProductQuantityTypeType.class), null, null);
    }

}
