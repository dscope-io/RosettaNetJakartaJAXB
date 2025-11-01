
package io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderCancellationReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.02", "PurchaseOrderCancellationReasonA");

    public PurchaseOrderCancellationReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseOrderCancellationReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
