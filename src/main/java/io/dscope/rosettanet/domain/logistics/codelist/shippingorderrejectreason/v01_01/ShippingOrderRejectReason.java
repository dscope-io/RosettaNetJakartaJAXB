
package io.dscope.rosettanet.domain.logistics.codelist.shippingorderrejectreason.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderRejectReason
    extends JAXBElement<ShippingOrderRejectReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01", "ShippingOrderRejectReason");

    public ShippingOrderRejectReason(ShippingOrderRejectReasonType value) {
        super(NAME, ((Class) ShippingOrderRejectReasonType.class), null, value);
    }

    public ShippingOrderRejectReason() {
        super(NAME, ((Class) ShippingOrderRejectReasonType.class), null, null);
    }

}
