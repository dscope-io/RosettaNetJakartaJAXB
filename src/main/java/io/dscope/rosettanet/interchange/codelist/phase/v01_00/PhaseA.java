
package io.dscope.rosettanet.interchange.codelist.phase.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PhaseA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00", "PhaseA");

    public PhaseA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PhaseA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
