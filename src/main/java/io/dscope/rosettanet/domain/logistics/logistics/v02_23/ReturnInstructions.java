
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReturnInstructions
    extends JAXBElement<ReturnInstructionsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", "ReturnInstructions");

    public ReturnInstructions(ReturnInstructionsType value) {
        super(NAME, ((Class) ReturnInstructionsType.class), null, value);
    }

    public ReturnInstructions() {
        super(NAME, ((Class) ReturnInstructionsType.class), null, null);
    }

}
