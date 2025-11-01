
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FloatCoordinate
    extends JAXBElement<FloatCoordinateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", "FloatCoordinate");

    public FloatCoordinate(FloatCoordinateType value) {
        super(NAME, ((Class) FloatCoordinateType.class), null, value);
    }

    public FloatCoordinate() {
        super(NAME, ((Class) FloatCoordinateType.class), null, null);
    }

}
