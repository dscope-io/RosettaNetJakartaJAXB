
package io.dscope.rosettanet.interchange.shippingorderrequest.v02_04;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderRequest", namespace = "urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.04")
public class ShippingOrderRequest
    extends JAXBElement<ShippingOrderRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.04", "ShippingOrderRequest");

    public ShippingOrderRequest(ShippingOrderRequestType value) {
        super(NAME, ((Class) ShippingOrderRequestType.class), null, value);
    }

    public ShippingOrderRequest() {
        super(NAME, ((Class) ShippingOrderRequestType.class), null, null);
    }

}
