
package io.dscope.rosettanet.interchange.codelist.phase.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Phase
    extends JAXBElement<PhaseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00", "Phase");

    public Phase(PhaseType value) {
        super(NAME, ((Class) PhaseType.class), null, value);
    }

    public Phase() {
        super(NAME, ((Class) PhaseType.class), null, null);
    }

}
