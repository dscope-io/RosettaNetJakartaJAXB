
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WorkInProcessType
    extends JAXBElement<WorkInProcessTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WorkInProcessType:xsd:codelist:1.0", "WorkInProcessType");

    public WorkInProcessType(WorkInProcessTypeType value) {
        super(NAME, ((Class) WorkInProcessTypeType.class), null, value);
    }

    public WorkInProcessType() {
        super(NAME, ((Class) WorkInProcessTypeType.class), null, null);
    }

}
