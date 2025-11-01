
package io.dscope.rosettanet.domain.logistics.codelist.instructiontype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InstructionTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:InstructionType:xsd:codelist:01.00", "InstructionTypeA");

    public InstructionTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public InstructionTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
