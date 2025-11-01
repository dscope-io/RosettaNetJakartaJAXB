
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderConfirmationNotification", namespace = "urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00")
public class ShippingOrderConfirmationNotification
    extends JAXBElement<ShippingOrderConfirmationNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00", "ShippingOrderConfirmationNotification");

    public ShippingOrderConfirmationNotification(ShippingOrderConfirmationNotificationType value) {
        super(NAME, ((Class) ShippingOrderConfirmationNotificationType.class), null, value);
    }

    public ShippingOrderConfirmationNotification() {
        super(NAME, ((Class) ShippingOrderConfirmationNotificationType.class), null, null);
    }

}
