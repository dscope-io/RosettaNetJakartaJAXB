
package io.dscope.rosettanet.domain.procurement.codelist.shippingservicelevel.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingServiceLevel
    extends JAXBElement<ShippingServiceLevelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ShippingServiceLevel:xsd:codelist:01.02", "ShippingServiceLevel");

    public ShippingServiceLevel(ShippingServiceLevelType value) {
        super(NAME, ((Class) ShippingServiceLevelType.class), null, value);
    }

    public ShippingServiceLevel() {
        super(NAME, ((Class) ShippingServiceLevelType.class), null, null);
    }

}
