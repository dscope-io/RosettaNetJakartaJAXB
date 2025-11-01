
package io.dscope.rosettanet.domain.procurement.codelist.paymentcondition.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentConditionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:01.02", "PaymentConditionA");

    public PaymentConditionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PaymentConditionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
