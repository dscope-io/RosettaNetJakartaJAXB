
package io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipDateCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:1.0", "ShipDateCodeA");

    public ShipDateCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipDateCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
