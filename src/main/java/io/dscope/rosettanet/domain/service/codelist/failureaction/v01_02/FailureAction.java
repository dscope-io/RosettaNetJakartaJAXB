
package io.dscope.rosettanet.domain.service.codelist.failureaction.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureAction
    extends JAXBElement<FailureActionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02", "FailureAction");

    public FailureAction(FailureActionType value) {
        super(NAME, ((Class) FailureActionType.class), null, value);
    }

    public FailureAction() {
        super(NAME, ((Class) FailureActionType.class), null, null);
    }

}
