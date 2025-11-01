
package io.dscope.rosettanet.domain.service.codelist.failuretype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:FailureType:xsd:codelist:01.02", "FailureTypeA");

    public FailureTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FailureTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
