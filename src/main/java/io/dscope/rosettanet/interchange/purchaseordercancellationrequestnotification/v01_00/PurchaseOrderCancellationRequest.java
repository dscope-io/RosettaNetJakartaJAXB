
package io.dscope.rosettanet.interchange.purchaseordercancellationrequestnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderCancellationRequest
    extends JAXBElement<PurchaseOrderCancellationRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderCancellationRequestNotification:xsd:schema:01.00", "PurchaseOrderCancellationRequest");

    public PurchaseOrderCancellationRequest(PurchaseOrderCancellationRequestType value) {
        super(NAME, ((Class) PurchaseOrderCancellationRequestType.class), null, value);
    }

    public PurchaseOrderCancellationRequest() {
        super(NAME, ((Class) PurchaseOrderCancellationRequestType.class), null, null);
    }

}
