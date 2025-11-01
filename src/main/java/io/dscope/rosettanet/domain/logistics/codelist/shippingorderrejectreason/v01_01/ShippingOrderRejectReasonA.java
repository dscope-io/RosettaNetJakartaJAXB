
package io.dscope.rosettanet.domain.logistics.codelist.shippingorderrejectreason.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderRejectReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01", "ShippingOrderRejectReasonA");

    public ShippingOrderRejectReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShippingOrderRejectReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
