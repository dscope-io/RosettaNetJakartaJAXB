
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductOrFamilyIdentification
    extends JAXBElement<ProductOrFamilyIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ProductOrFamilyIdentification");

    public ProductOrFamilyIdentification(ProductOrFamilyIdentificationType value) {
        super(NAME, ((Class) ProductOrFamilyIdentificationType.class), null, value);
    }

    public ProductOrFamilyIdentification() {
        super(NAME, ((Class) ProductOrFamilyIdentificationType.class), null, null);
    }

}
