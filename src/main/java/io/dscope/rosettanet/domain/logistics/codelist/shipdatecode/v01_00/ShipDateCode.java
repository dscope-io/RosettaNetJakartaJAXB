
package io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipDateCode
    extends JAXBElement<ShipDateCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:1.0", "ShipDateCode");

    public ShipDateCode(ShipDateCodeType value) {
        super(NAME, ((Class) ShipDateCodeType.class), null, value);
    }

    public ShipDateCode() {
        super(NAME, ((Class) ShipDateCodeType.class), null, null);
    }

}
