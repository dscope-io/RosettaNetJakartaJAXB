
package io.dscope.rosettanet.domain.design.design.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductMass
    extends JAXBElement<ProductMassType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.17", "ProductMass");

    public ProductMass(ProductMassType value) {
        super(NAME, ((Class) ProductMassType.class), null, value);
    }

    public ProductMass() {
        super(NAME, ((Class) ProductMassType.class), null, null);
    }

}
