
package io.dscope.rosettanet.universal.productidentification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductDescription
    extends JAXBElement<ProductDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0", "ProductDescription");

    public ProductDescription(ProductDescriptionType value) {
        super(NAME, ((Class) ProductDescriptionType.class), null, value);
    }

    public ProductDescription() {
        super(NAME, ((Class) ProductDescriptionType.class), null, null);
    }

}
