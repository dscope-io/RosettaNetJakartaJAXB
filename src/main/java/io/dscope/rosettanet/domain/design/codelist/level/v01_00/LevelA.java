
package io.dscope.rosettanet.domain.design.codelist.level.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LevelA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01", "LevelA");

    public LevelA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LevelA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
