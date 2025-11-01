
package io.dscope.rosettanet.domain.shared.codelist.paymenttype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PaymentType:xsd:codelist:01.01", "PaymentTypeA");

    public PaymentTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PaymentTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
