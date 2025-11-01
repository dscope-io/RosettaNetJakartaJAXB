
package io.dscope.rosettanet.domain.service.codelist.repairtype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RepairTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02", "RepairTypeA");

    public RepairTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RepairTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
