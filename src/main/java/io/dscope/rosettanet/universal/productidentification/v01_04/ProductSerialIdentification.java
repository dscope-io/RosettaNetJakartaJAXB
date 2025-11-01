
package io.dscope.rosettanet.universal.productidentification.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductSerialIdentification
    extends JAXBElement<ProductSerialIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", "ProductSerialIdentification");

    public ProductSerialIdentification(ProductSerialIdentificationType value) {
        super(NAME, ((Class) ProductSerialIdentificationType.class), null, value);
    }

    public ProductSerialIdentification() {
        super(NAME, ((Class) ProductSerialIdentificationType.class), null, null);
    }

}
