
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Instructions
    extends JAXBElement<InstructionsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", "Instructions");

    public Instructions(InstructionsType value) {
        super(NAME, ((Class) InstructionsType.class), null, value);
    }

    public Instructions() {
        super(NAME, ((Class) InstructionsType.class), null, null);
    }

}
