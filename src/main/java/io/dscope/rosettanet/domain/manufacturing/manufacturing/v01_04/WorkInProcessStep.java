
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WorkInProcessStep
    extends JAXBElement<WorkInProcessStepType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.04", "WorkInProcessStep");

    public WorkInProcessStep(WorkInProcessStepType value) {
        super(NAME, ((Class) WorkInProcessStepType.class), null, value);
    }

    public WorkInProcessStep() {
        super(NAME, ((Class) WorkInProcessStepType.class), null, null);
    }

}
