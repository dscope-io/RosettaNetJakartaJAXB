
package io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationreasontype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingOrderCancellationReasonType
    extends JAXBElement<ShippingOrderCancellationReasonTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationReasonType:xsd:codelist:1.0", "ShippingOrderCancellationReasonType");

    public ShippingOrderCancellationReasonType(ShippingOrderCancellationReasonTypeType value) {
        super(NAME, ((Class) ShippingOrderCancellationReasonTypeType.class), null, value);
    }

    public ShippingOrderCancellationReasonType() {
        super(NAME, ((Class) ShippingOrderCancellationReasonTypeType.class), null, null);
    }

}
