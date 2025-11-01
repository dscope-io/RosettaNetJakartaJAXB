
package io.dscope.rosettanet.interchange.codelist.shipmentstatus.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipmentStatus:xsd:codelist:01.03", "ShipmentStatusA");

    public ShipmentStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipmentStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
