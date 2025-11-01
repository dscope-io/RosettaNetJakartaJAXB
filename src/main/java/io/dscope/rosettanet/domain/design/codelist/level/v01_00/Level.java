
package io.dscope.rosettanet.domain.design.codelist.level.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Level
    extends JAXBElement<LevelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01", "Level");

    public Level(LevelType value) {
        super(NAME, ((Class) LevelType.class), null, value);
    }

    public Level() {
        super(NAME, ((Class) LevelType.class), null, null);
    }

}
