
package io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentMethodA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.01", "PaymentMethodA");

    public PaymentMethodA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PaymentMethodA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
