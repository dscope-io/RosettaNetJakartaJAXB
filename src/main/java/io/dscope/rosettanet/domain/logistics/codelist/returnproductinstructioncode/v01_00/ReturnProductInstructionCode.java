
package io.dscope.rosettanet.domain.logistics.codelist.returnproductinstructioncode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReturnProductInstructionCode
    extends JAXBElement<ReturnProductInstructionCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ReturnProductInstructionCode:xsd:codelist:01.00", "ReturnProductInstructionCode");

    public ReturnProductInstructionCode(ReturnProductInstructionCodeType value) {
        super(NAME, ((Class) ReturnProductInstructionCodeType.class), null, value);
    }

    public ReturnProductInstructionCode() {
        super(NAME, ((Class) ReturnProductInstructionCodeType.class), null, null);
    }

}
