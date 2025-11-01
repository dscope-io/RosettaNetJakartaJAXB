
package io.dscope.rosettanet.domain.shared.codelist.paymenttype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentType
    extends JAXBElement<PaymentTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PaymentType:xsd:codelist:01.01", "PaymentType");

    public PaymentType(PaymentTypeType value) {
        super(NAME, ((Class) PaymentTypeType.class), null, value);
    }

    public PaymentType() {
        super(NAME, ((Class) PaymentTypeType.class), null, null);
    }

}
