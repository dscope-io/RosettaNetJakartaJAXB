
package io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentMethod
    extends JAXBElement<PaymentMethodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.01", "PaymentMethod");

    public PaymentMethod(PaymentMethodType value) {
        super(NAME, ((Class) PaymentMethodType.class), null, value);
    }

    public PaymentMethod() {
        super(NAME, ((Class) PaymentMethodType.class), null, null);
    }

}
