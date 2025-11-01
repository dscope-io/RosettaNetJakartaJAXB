
package io.dscope.rosettanet.domain.service.codelist.returnproductinstruction.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReturnProductInstruction
    extends JAXBElement<ReturnProductInstructionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ReturnProductInstruction:xsd:codelist:01.02", "ReturnProductInstruction");

    public ReturnProductInstruction(ReturnProductInstructionType value) {
        super(NAME, ((Class) ReturnProductInstructionType.class), null, value);
    }

    public ReturnProductInstruction() {
        super(NAME, ((Class) ReturnProductInstructionType.class), null, null);
    }

}
