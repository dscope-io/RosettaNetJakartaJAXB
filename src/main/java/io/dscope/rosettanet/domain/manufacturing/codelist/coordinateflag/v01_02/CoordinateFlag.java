
package io.dscope.rosettanet.domain.manufacturing.codelist.coordinateflag.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CoordinateFlag
    extends JAXBElement<CoordinateFlagType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:CoordinateFlag:xsd:codelist:01.02", "CoordinateFlag");

    public CoordinateFlag(CoordinateFlagType value) {
        super(NAME, ((Class) CoordinateFlagType.class), null, value);
    }

    public CoordinateFlag() {
        super(NAME, ((Class) CoordinateFlagType.class), null, null);
    }

}
