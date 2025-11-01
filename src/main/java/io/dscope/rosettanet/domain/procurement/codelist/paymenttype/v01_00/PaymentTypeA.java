
package io.dscope.rosettanet.domain.procurement.codelist.paymenttype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PaymentType:xsd:codelist:1.0", "PaymentTypeA");

    public PaymentTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PaymentTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
