
package io.dscope.rosettanet.domain.procurement.codelist.monetaryamounttype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MonetaryAmountType
    extends JAXBElement<MonetaryAmountTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:MonetaryAmountType:xsd:codelist:1.0", "MonetaryAmountType");

    public MonetaryAmountType(MonetaryAmountTypeType value) {
        super(NAME, ((Class) MonetaryAmountTypeType.class), null, value);
    }

    public MonetaryAmountType() {
        super(NAME, ((Class) MonetaryAmountTypeType.class), null, null);
    }

}
