
package io.dscope.rosettanet.domain.procurement.procurement.v01_06;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialPrice
    extends JAXBElement<SpecialPriceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06", "SpecialPrice");

    public SpecialPrice(SpecialPriceType value) {
        super(NAME, ((Class) SpecialPriceType.class), null, value);
    }

    public SpecialPrice() {
        super(NAME, ((Class) SpecialPriceType.class), null, null);
    }

}
