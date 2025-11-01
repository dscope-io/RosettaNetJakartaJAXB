
package io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AmountTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:AmountType:xsd:codelist:01.02", "AmountTypeA");

    public AmountTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public AmountTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
