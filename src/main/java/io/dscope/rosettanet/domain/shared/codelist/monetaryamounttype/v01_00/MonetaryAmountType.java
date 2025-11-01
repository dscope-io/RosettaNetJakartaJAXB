
package io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MonetaryAmountType
    extends JAXBElement<MonetaryAmountTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.00", "MonetaryAmountType");

    public MonetaryAmountType(MonetaryAmountTypeType value) {
        super(NAME, ((Class) MonetaryAmountTypeType.class), null, value);
    }

    public MonetaryAmountType() {
        super(NAME, ((Class) MonetaryAmountTypeType.class), null, null);
    }

}
