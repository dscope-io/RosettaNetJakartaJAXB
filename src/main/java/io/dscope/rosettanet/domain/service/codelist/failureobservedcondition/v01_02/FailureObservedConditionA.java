
package io.dscope.rosettanet.domain.service.codelist.failureobservedcondition.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureObservedConditionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:FailureObservedCondition:xsd:codelist:01.02", "FailureObservedConditionA");

    public FailureObservedConditionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FailureObservedConditionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
