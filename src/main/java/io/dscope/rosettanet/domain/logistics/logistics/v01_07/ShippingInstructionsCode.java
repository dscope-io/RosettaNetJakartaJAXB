
package io.dscope.rosettanet.domain.logistics.logistics.v01_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingInstructionsCode
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", "ShippingInstructionsCode");

    public ShippingInstructionsCode(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public ShippingInstructionsCode() {
        super(NAME, ((Class) String.class), null, null);
    }

}
