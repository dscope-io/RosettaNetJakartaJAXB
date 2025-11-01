
package io.dscope.rosettanet.domain.logistics.logistics.v02_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingLabel
    extends JAXBElement<ShippingLabelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", "ShippingLabel");

    public ShippingLabel(ShippingLabelType value) {
        super(NAME, ((Class) ShippingLabelType.class), null, value);
    }

    public ShippingLabel() {
        super(NAME, ((Class) ShippingLabelType.class), null, null);
    }

}
