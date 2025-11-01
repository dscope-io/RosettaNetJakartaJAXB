
package io.dscope.rosettanet.domain.logistics.codelist.returnproductinstructioncode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReturnProductInstructionCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ReturnProductInstructionCode:xsd:codelist:01.00", "ReturnProductInstructionCodeA");

    public ReturnProductInstructionCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ReturnProductInstructionCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
