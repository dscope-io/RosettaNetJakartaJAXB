
package io.dscope.rosettanet.interchange.purchaseorderconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderConfirmation", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderConfirmationNotification:xsd:schema:01.00")
public class PurchaseOrderConfirmation
    extends JAXBElement<PurchaseOrderConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderConfirmationNotification:xsd:schema:01.00", "PurchaseOrderConfirmation");

    public PurchaseOrderConfirmation(PurchaseOrderConfirmationType value) {
        super(NAME, ((Class) PurchaseOrderConfirmationType.class), null, value);
    }

    public PurchaseOrderConfirmation() {
        super(NAME, ((Class) PurchaseOrderConfirmationType.class), null, null);
    }

}
