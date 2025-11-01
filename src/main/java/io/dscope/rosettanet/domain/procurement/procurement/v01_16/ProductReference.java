
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductReference
    extends JAXBElement<ProductReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16", "ProductReference");

    public ProductReference(ProductReferenceType value) {
        super(NAME, ((Class) ProductReferenceType.class), null, value);
    }

    public ProductReference() {
        super(NAME, ((Class) ProductReferenceType.class), null, null);
    }

}
