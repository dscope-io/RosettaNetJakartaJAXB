
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductPackaging
    extends JAXBElement<ProductPackagingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "ProductPackaging");

    public ProductPackaging(ProductPackagingType value) {
        super(NAME, ((Class) ProductPackagingType.class), null, value);
    }

    public ProductPackaging() {
        super(NAME, ((Class) ProductPackagingType.class), null, null);
    }

}
