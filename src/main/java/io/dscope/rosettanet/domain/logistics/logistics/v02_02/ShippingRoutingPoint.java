
package io.dscope.rosettanet.domain.logistics.logistics.v02_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingRoutingPoint
    extends JAXBElement<ShippingRoutingPointType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02", "ShippingRoutingPoint");

    public ShippingRoutingPoint(ShippingRoutingPointType value) {
        super(NAME, ((Class) ShippingRoutingPointType.class), null, value);
    }

    public ShippingRoutingPoint() {
        super(NAME, ((Class) ShippingRoutingPointType.class), null, null);
    }

}
