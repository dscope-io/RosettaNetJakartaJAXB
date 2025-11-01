
package io.dscope.rosettanet.interchange.shippingordercancellationrequest.v02_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingOrderCancellationRequest", namespace = "urn:rosettanet:specification:interchange:ShippingOrderCancellationRequest:xsd:schema:02.02")
public class ShippingOrderCancellationRequest
    extends JAXBElement<ShippingOrderCancellationRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingOrderCancellationRequest:xsd:schema:02.02", "ShippingOrderCancellationRequest");

    public ShippingOrderCancellationRequest(ShippingOrderCancellationRequestType value) {
        super(NAME, ((Class) ShippingOrderCancellationRequestType.class), null, value);
    }

    public ShippingOrderCancellationRequest() {
        super(NAME, ((Class) ShippingOrderCancellationRequestType.class), null, null);
    }

}
