
package io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingServiceLevelA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", "ShippingServiceLevelA");

    public ShippingServiceLevelA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShippingServiceLevelA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
