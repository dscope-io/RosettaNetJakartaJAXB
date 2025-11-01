
package io.dscope.rosettanet.domain.procurement.codelist.paymentmethod.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentMethod
    extends JAXBElement<PaymentMethodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PaymentMethod:xsd:codelist:01.02", "PaymentMethod");

    public PaymentMethod(PaymentMethodType value) {
        super(NAME, ((Class) PaymentMethodType.class), null, value);
    }

    public PaymentMethod() {
        super(NAME, ((Class) PaymentMethodType.class), null, null);
    }

}
