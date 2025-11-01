
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductAttribute
    extends JAXBElement<ProductAttributeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", "ProductAttribute");

    public ProductAttribute(ProductAttributeType value) {
        super(NAME, ((Class) ProductAttributeType.class), null, value);
    }

    public ProductAttribute() {
        super(NAME, ((Class) ProductAttributeType.class), null, null);
    }

}
