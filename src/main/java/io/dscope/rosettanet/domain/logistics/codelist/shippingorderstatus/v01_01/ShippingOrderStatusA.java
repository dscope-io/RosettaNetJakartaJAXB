
package io.dscope.rosettanet.domain.logistics.codelist.shippingorderstatus.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderStatus:xsd:codelist:01.01", "ShippingOrderStatusA");

    public ShippingOrderStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShippingOrderStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
