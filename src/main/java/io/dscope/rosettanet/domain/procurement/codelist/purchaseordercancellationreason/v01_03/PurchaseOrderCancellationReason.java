
package io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderCancellationReason
    extends JAXBElement<PurchaseOrderCancellationReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.03", "PurchaseOrderCancellationReason");

    public PurchaseOrderCancellationReason(PurchaseOrderCancellationReasonType value) {
        super(NAME, ((Class) PurchaseOrderCancellationReasonType.class), null, value);
    }

    public PurchaseOrderCancellationReason() {
        super(NAME, ((Class) PurchaseOrderCancellationReasonType.class), null, null);
    }

}
