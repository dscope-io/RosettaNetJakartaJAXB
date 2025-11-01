
package io.dscope.rosettanet.interchange.shippingordercancellationconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderCancellationConfirmation", namespace = "urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmationNotification:xsd:schema:01.00")
public class ShippingOrderCancellationConfirmation
    extends JAXBElement<ShippingOrderCancellationConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmationNotification:xsd:schema:01.00", "ShippingOrderCancellationConfirmation");

    public ShippingOrderCancellationConfirmation(ShippingOrderCancellationConfirmationType value) {
        super(NAME, ((Class) ShippingOrderCancellationConfirmationType.class), null, value);
    }

    public ShippingOrderCancellationConfirmation() {
        super(NAME, ((Class) ShippingOrderCancellationConfirmationType.class), null, null);
    }

}
