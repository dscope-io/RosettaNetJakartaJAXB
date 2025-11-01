
package io.dscope.rosettanet.universal.productidentification.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NewProduct
    extends JAXBElement<NewProductType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", "NewProduct");

    public NewProduct(NewProductType value) {
        super(NAME, ((Class) NewProductType.class), null, value);
    }

    public NewProduct() {
        super(NAME, ((Class) NewProductType.class), null, null);
    }

}
