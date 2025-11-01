
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class HexCoordinate
    extends JAXBElement<HexCoordinateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", "HexCoordinate");

    public HexCoordinate(HexCoordinateType value) {
        super(NAME, ((Class) HexCoordinateType.class), null, value);
    }

    public HexCoordinate() {
        super(NAME, ((Class) HexCoordinateType.class), null, null);
    }

}
