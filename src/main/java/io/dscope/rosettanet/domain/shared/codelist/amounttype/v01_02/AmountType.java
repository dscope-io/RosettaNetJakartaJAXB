
package io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AmountType
    extends JAXBElement<AmountTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:AmountType:xsd:codelist:01.02", "AmountType");

    public AmountType(AmountTypeType value) {
        super(NAME, ((Class) AmountTypeType.class), null, value);
    }

    public AmountType() {
        super(NAME, ((Class) AmountTypeType.class), null, null);
    }

}
