
package io.dscope.rosettanet.domain.service.codelist.failuremodifier.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureModifier
    extends JAXBElement<FailureModifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02", "FailureModifier");

    public FailureModifier(FailureModifierType value) {
        super(NAME, ((Class) FailureModifierType.class), null, value);
    }

    public FailureModifier() {
        super(NAME, ((Class) FailureModifierType.class), null, null);
    }

}
