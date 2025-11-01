
package io.dscope.rosettanet.interchange.shippingorderrequest.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderRequest", namespace = "urn:rosettanet:specification:interchange:ShippingOrderRequestNotification:xsd:schema:01.00")
public class ShippingOrderRequest
    extends JAXBElement<ShippingOrderRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderRequestNotification:xsd:schema:01.00", "ShippingOrderRequest");

    public ShippingOrderRequest(ShippingOrderRequestType value) {
        super(NAME, ((Class) ShippingOrderRequestType.class), null, value);
    }

    public ShippingOrderRequest() {
        super(NAME, ((Class) ShippingOrderRequestType.class), null, null);
    }

}
