
package io.dscope.rosettanet.interchange.purchaseorderupdatenotification.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderUpdateNotification", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderUpdateNotification:xsd:schema:02.01")
public class PurchaseOrderUpdateNotification
    extends JAXBElement<PurchaseOrderUpdateNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderUpdateNotification:xsd:schema:02.01", "PurchaseOrderUpdateNotification");

    public PurchaseOrderUpdateNotification(PurchaseOrderUpdateNotificationType value) {
        super(NAME, ((Class) PurchaseOrderUpdateNotificationType.class), null, value);
    }

    public PurchaseOrderUpdateNotification() {
        super(NAME, ((Class) PurchaseOrderUpdateNotificationType.class), null, null);
    }

}
