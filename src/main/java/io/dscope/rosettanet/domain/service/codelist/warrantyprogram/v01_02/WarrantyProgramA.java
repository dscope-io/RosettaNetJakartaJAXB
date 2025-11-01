
package io.dscope.rosettanet.domain.service.codelist.warrantyprogram.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarrantyProgramA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02", "WarrantyProgramA");

    public WarrantyProgramA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WarrantyProgramA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
