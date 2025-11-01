
package io.dscope.rosettanet.domain.service.codelist.failureobservedcondition.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureObservedCondition
    extends JAXBElement<FailureObservedConditionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:FailureObservedCondition:xsd:codelist:01.02", "FailureObservedCondition");

    public FailureObservedCondition(FailureObservedConditionType value) {
        super(NAME, ((Class) FailureObservedConditionType.class), null, value);
    }

    public FailureObservedCondition() {
        super(NAME, ((Class) FailureObservedConditionType.class), null, null);
    }

}
