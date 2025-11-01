
package io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipDateCode
    extends JAXBElement<ShipDateCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:01.02", "ShipDateCode");

    public ShipDateCode(ShipDateCodeType value) {
        super(NAME, ((Class) ShipDateCodeType.class), null, value);
    }

    public ShipDateCode() {
        super(NAME, ((Class) ShipDateCodeType.class), null, null);
    }

}
