
package io.dscope.rosettanet.domain.design.design.v02_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductIdentifier
    extends JAXBElement<ProductIdentifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.07", "ProductIdentifier");

    public ProductIdentifier(ProductIdentifierType value) {
        super(NAME, ((Class) ProductIdentifierType.class), null, value);
    }

    public ProductIdentifier() {
        super(NAME, ((Class) ProductIdentifierType.class), null, null);
    }

}
