
package io.dscope.rosettanet.interchange.purchaseordercancellationconfirmationnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderCancellationConfirmation
    extends JAXBElement<PurchaseOrderCancellationConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderCancellationConfirmationNotification:xsd:schema:01.00", "PurchaseOrderCancellationConfirmation");

    public PurchaseOrderCancellationConfirmation(PurchaseOrderCancellationConfirmationType value) {
        super(NAME, ((Class) PurchaseOrderCancellationConfirmationType.class), null, value);
    }

    public PurchaseOrderCancellationConfirmation() {
        super(NAME, ((Class) PurchaseOrderCancellationConfirmationType.class), null, null);
    }

}
