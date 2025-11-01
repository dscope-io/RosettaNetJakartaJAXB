
package io.dscope.rosettanet.universal.productidentification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductIdentification
    extends JAXBElement<ProductIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0", "ProductIdentification");

    public ProductIdentification(ProductIdentificationType value) {
        super(NAME, ((Class) ProductIdentificationType.class), null, value);
    }

    public ProductIdentification() {
        super(NAME, ((Class) ProductIdentificationType.class), null, null);
    }

}
