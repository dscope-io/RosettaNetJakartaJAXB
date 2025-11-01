
package io.dscope.rosettanet.domain.procurement.codelist.paymenttype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentType
    extends JAXBElement<PaymentTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PaymentType:xsd:codelist:01.02", "PaymentType");

    public PaymentType(PaymentTypeType value) {
        super(NAME, ((Class) PaymentTypeType.class), null, value);
    }

    public PaymentType() {
        super(NAME, ((Class) PaymentTypeType.class), null, null);
    }

}
