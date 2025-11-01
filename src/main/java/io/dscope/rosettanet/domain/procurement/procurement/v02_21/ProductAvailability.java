
package io.dscope.rosettanet.domain.procurement.procurement.v02_21;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductAvailability
    extends JAXBElement<ProductAvailabilityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21", "ProductAvailability");

    public ProductAvailability(ProductAvailabilityType value) {
        super(NAME, ((Class) ProductAvailabilityType.class), null, value);
    }

    public ProductAvailability() {
        super(NAME, ((Class) ProductAvailabilityType.class), null, null);
    }

}
