
package io.dscope.rosettanet.domain.procurement.procurement.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialDiscount
    extends JAXBElement<SpecialDiscountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18", "SpecialDiscount");

    public SpecialDiscount(SpecialDiscountType value) {
        super(NAME, ((Class) SpecialDiscountType.class), null, value);
    }

    public SpecialDiscount() {
        super(NAME, ((Class) SpecialDiscountType.class), null, null);
    }

}
