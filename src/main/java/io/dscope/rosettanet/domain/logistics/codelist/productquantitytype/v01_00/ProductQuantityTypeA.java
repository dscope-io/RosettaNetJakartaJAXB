
package io.dscope.rosettanet.domain.logistics.codelist.productquantitytype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductQuantityTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ProductQuantityType:xsd:codelist:01.00", "ProductQuantityTypeA");

    public ProductQuantityTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductQuantityTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
