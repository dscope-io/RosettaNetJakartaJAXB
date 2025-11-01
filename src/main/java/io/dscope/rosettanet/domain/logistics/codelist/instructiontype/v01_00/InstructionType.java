
package io.dscope.rosettanet.domain.logistics.codelist.instructiontype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InstructionType
    extends JAXBElement<InstructionTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:InstructionType:xsd:codelist:01.00", "InstructionType");

    public InstructionType(InstructionTypeType value) {
        super(NAME, ((Class) InstructionTypeType.class), null, value);
    }

    public InstructionType() {
        super(NAME, ((Class) InstructionTypeType.class), null, null);
    }

}
