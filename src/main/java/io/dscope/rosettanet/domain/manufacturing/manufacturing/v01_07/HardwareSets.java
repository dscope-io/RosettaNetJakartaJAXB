
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class HardwareSets
    extends JAXBElement<HardwareSetsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", "HardwareSets");

    public HardwareSets(HardwareSetsType value) {
        super(NAME, ((Class) HardwareSetsType.class), null, value);
    }

    public HardwareSets() {
        super(NAME, ((Class) HardwareSetsType.class), null, null);
    }

}
