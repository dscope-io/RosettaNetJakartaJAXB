
package io.dscope.rosettanet.domain.procurement.procurement.v01_21;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialDiscount
    extends JAXBElement<SpecialDiscountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.21", "SpecialDiscount");

    public SpecialDiscount(SpecialDiscountType value) {
        super(NAME, ((Class) SpecialDiscountType.class), null, value);
    }

    public SpecialDiscount() {
        super(NAME, ((Class) SpecialDiscountType.class), null, null);
    }

}
