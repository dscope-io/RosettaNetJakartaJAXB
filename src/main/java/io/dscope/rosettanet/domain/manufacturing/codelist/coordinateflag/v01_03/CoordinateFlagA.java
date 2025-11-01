
package io.dscope.rosettanet.domain.manufacturing.codelist.coordinateflag.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CoordinateFlagA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:CoordinateFlag:xsd:codelist:01.03", "CoordinateFlagA");

    public CoordinateFlagA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CoordinateFlagA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
