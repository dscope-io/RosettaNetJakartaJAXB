
package io.dscope.rosettanet.domain.service.codelist.repairtype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RepairType
    extends JAXBElement<RepairTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02", "RepairType");

    public RepairType(RepairTypeType value) {
        super(NAME, ((Class) RepairTypeType.class), null, value);
    }

    public RepairType() {
        super(NAME, ((Class) RepairTypeType.class), null, null);
    }

}
