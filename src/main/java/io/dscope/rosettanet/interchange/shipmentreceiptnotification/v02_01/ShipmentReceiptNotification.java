
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShipmentReceiptNotification", namespace = "urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01")
public class ShipmentReceiptNotification
    extends JAXBElement<ShipmentReceiptNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01", "ShipmentReceiptNotification");

    public ShipmentReceiptNotification(ShipmentReceiptNotificationType value) {
        super(NAME, ((Class) ShipmentReceiptNotificationType.class), null, value);
    }

    public ShipmentReceiptNotification() {
        super(NAME, ((Class) ShipmentReceiptNotificationType.class), null, null);
    }

}
