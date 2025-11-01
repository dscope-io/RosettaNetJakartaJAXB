
package io.dscope.rosettanet.domain.service.codelist.failureaction.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureActionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02", "FailureActionA");

    public FailureActionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FailureActionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
