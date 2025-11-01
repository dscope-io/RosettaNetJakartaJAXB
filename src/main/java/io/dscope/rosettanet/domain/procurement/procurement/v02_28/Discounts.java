
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Discounts
    extends JAXBElement<DiscountsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "Discounts");

    public Discounts(DiscountsType value) {
        super(NAME, ((Class) DiscountsType.class), null, value);
    }

    public Discounts() {
        super(NAME, ((Class) DiscountsType.class), null, null);
    }

}
