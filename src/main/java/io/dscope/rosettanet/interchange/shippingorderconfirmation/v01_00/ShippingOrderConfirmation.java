
package io.dscope.rosettanet.interchange.shippingorderconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderConfirmation", namespace = "urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:01.00")
public class ShippingOrderConfirmation
    extends JAXBElement<ShippingOrderConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:01.00", "ShippingOrderConfirmation");

    public ShippingOrderConfirmation(ShippingOrderConfirmationType value) {
        super(NAME, ((Class) ShippingOrderConfirmationType.class), null, value);
    }

    public ShippingOrderConfirmation() {
        super(NAME, ((Class) ShippingOrderConfirmationType.class), null, null);
    }

}
