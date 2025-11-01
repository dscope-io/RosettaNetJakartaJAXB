
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferCoordinate
    extends JAXBElement<WaferCoordinateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "WaferCoordinate");

    public WaferCoordinate(WaferCoordinateType value) {
        super(NAME, ((Class) WaferCoordinateType.class), null, value);
    }

    public WaferCoordinate() {
        super(NAME, ((Class) WaferCoordinateType.class), null, null);
    }

}
