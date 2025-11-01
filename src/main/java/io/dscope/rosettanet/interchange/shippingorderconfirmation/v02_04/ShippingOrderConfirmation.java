
package io.dscope.rosettanet.interchange.shippingorderconfirmation.v02_04;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderConfirmation", namespace = "urn:rosettanet:specification:interchange:ShippingOrderConfirmation:xsd:schema:02.04")
public class ShippingOrderConfirmation
    extends JAXBElement<ShippingOrderConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderConfirmation:xsd:schema:02.04", "ShippingOrderConfirmation");

    public ShippingOrderConfirmation(ShippingOrderConfirmationType value) {
        super(NAME, ((Class) ShippingOrderConfirmationType.class), null, value);
    }

    public ShippingOrderConfirmation() {
        super(NAME, ((Class) ShippingOrderConfirmationType.class), null, null);
    }

}
