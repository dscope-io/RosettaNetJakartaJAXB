
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductInformation
    extends JAXBElement<ProductInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ProductInformation");

    public ProductInformation(ProductInformationType value) {
        super(NAME, ((Class) ProductInformationType.class), null, value);
    }

    public ProductInformation() {
        super(NAME, ((Class) ProductInformationType.class), null, null);
    }

}
