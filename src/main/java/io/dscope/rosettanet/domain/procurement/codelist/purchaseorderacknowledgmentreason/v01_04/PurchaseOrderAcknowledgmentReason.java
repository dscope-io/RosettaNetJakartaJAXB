
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderAcknowledgmentReason
    extends JAXBElement<PurchaseOrderAcknowledgmentReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", "PurchaseOrderAcknowledgmentReason");

    public PurchaseOrderAcknowledgmentReason(PurchaseOrderAcknowledgmentReasonType value) {
        super(NAME, ((Class) PurchaseOrderAcknowledgmentReasonType.class), null, value);
    }

    public PurchaseOrderAcknowledgmentReason() {
        super(NAME, ((Class) PurchaseOrderAcknowledgmentReasonType.class), null, null);
    }

}
