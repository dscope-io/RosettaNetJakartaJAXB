
package io.dscope.rosettanet.domain.procurement.codelist.paymentcondition.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentCondition
    extends JAXBElement<PaymentConditionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:01.02", "PaymentCondition");

    public PaymentCondition(PaymentConditionType value) {
        super(NAME, ((Class) PaymentConditionType.class), null, value);
    }

    public PaymentCondition() {
        super(NAME, ((Class) PaymentConditionType.class), null, null);
    }

}
