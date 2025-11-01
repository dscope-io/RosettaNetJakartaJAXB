
package io.dscope.rosettanet.domain.salesreporting.codelist.paymentmethod.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentMethod
    extends JAXBElement<PaymentMethodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:PaymentMethod:xsd:codelist:1.0", "PaymentMethod");

    public PaymentMethod(PaymentMethodType value) {
        super(NAME, ((Class) PaymentMethodType.class), null, value);
    }

    public PaymentMethod() {
        super(NAME, ((Class) PaymentMethodType.class), null, null);
    }

}
