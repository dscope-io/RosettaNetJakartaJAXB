
package io.dscope.rosettanet.domain.procurement.codelist.monetaryamounttype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MonetaryAmountTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:MonetaryAmountType:xsd:codelist:01.02", "MonetaryAmountTypeA");

    public MonetaryAmountTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public MonetaryAmountTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
