
package io.dscope.rosettanet.domain.logistics.codelist.shippingorderstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderStatus
    extends JAXBElement<ShippingOrderStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderStatus:xsd:codelist:01.00", "ShippingOrderStatus");

    public ShippingOrderStatus(ShippingOrderStatusType value) {
        super(NAME, ((Class) ShippingOrderStatusType.class), null, value);
    }

    public ShippingOrderStatus() {
        super(NAME, ((Class) ShippingOrderStatusType.class), null, null);
    }

}
