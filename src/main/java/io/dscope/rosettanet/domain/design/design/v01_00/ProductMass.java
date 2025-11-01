
package io.dscope.rosettanet.domain.design.design.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductMass
    extends JAXBElement<ProductMassType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.01", "ProductMass");

    public ProductMass(ProductMassType value) {
        super(NAME, ((Class) ProductMassType.class), null, value);
    }

    public ProductMass() {
        super(NAME, ((Class) ProductMassType.class), null, null);
    }

}
