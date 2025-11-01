
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CreditCard
    extends JAXBElement<CreditCardType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", "CreditCard");

    public CreditCard(CreditCardType value) {
        super(NAME, ((Class) CreditCardType.class), null, value);
    }

    public CreditCard() {
        super(NAME, ((Class) CreditCardType.class), null, null);
    }

}
