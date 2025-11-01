
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentOrder
    extends JAXBElement<PaymentOrderType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", "PaymentOrder");

    public PaymentOrder(PaymentOrderType value) {
        super(NAME, ((Class) PaymentOrderType.class), null, value);
    }

    public PaymentOrder() {
        super(NAME, ((Class) PaymentOrderType.class), null, null);
    }

}
