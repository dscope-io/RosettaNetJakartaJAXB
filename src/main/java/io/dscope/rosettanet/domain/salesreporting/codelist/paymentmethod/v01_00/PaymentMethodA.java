
package io.dscope.rosettanet.domain.salesreporting.codelist.paymentmethod.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentMethodA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:PaymentMethod:xsd:codelist:1.0", "PaymentMethodA");

    public PaymentMethodA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PaymentMethodA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
