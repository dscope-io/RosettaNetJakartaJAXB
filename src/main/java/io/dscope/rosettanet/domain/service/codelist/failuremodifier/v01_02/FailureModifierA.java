
package io.dscope.rosettanet.domain.service.codelist.failuremodifier.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureModifierA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02", "FailureModifierA");

    public FailureModifierA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FailureModifierA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
