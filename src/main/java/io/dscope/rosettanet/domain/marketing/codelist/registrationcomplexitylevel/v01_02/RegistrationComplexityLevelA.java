
package io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationComplexityLevelA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", "RegistrationComplexityLevelA");

    public RegistrationComplexityLevelA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RegistrationComplexityLevelA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
