
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class UnitPrice
    extends JAXBElement<UnitPriceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "UnitPrice");

    public UnitPrice(UnitPriceType value) {
        super(NAME, ((Class) UnitPriceType.class), null, value);
    }

    public UnitPrice() {
        super(NAME, ((Class) UnitPriceType.class), null, null);
    }

}
