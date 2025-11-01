
package io.dscope.rosettanet.domain.service.codelist.warrantyprogram.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarrantyProgram
    extends JAXBElement<WarrantyProgramType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02", "WarrantyProgram");

    public WarrantyProgram(WarrantyProgramType value) {
        super(NAME, ((Class) WarrantyProgramType.class), null, value);
    }

    public WarrantyProgram() {
        super(NAME, ((Class) WarrantyProgramType.class), null, null);
    }

}
