
package io.dscope.rosettanet.domain.service.codelist.returnproductinstruction.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReturnProductInstructionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ReturnProductInstruction:xsd:codelist:01.02", "ReturnProductInstructionA");

    public ReturnProductInstructionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ReturnProductInstructionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
