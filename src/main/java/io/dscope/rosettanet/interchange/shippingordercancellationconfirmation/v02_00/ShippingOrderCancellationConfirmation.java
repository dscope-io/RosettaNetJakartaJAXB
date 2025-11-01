
package io.dscope.rosettanet.interchange.shippingordercancellationconfirmation.v02_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderCancellationConfirmation", namespace = "urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmation:xsd:schema:02.00")
public class ShippingOrderCancellationConfirmation
    extends JAXBElement<ShippingOrderCancellationConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmation:xsd:schema:02.00", "ShippingOrderCancellationConfirmation");

    public ShippingOrderCancellationConfirmation(ShippingOrderCancellationConfirmationType value) {
        super(NAME, ((Class) ShippingOrderCancellationConfirmationType.class), null, value);
    }

    public ShippingOrderCancellationConfirmation() {
        super(NAME, ((Class) ShippingOrderCancellationConfirmationType.class), null, null);
    }

}
