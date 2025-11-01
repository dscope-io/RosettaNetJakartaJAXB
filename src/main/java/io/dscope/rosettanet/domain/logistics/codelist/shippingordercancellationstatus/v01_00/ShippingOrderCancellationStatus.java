
package io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderCancellationStatus
    extends JAXBElement<ShippingOrderCancellationStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:1.0", "ShippingOrderCancellationStatus");

    public ShippingOrderCancellationStatus(ShippingOrderCancellationStatusType value) {
        super(NAME, ((Class) ShippingOrderCancellationStatusType.class), null, value);
    }

    public ShippingOrderCancellationStatus() {
        super(NAME, ((Class) ShippingOrderCancellationStatusType.class), null, null);
    }

}
