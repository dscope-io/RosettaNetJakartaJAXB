
package io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationComplexityLevel
    extends JAXBElement<RegistrationComplexityLevelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", "RegistrationComplexityLevel");

    public RegistrationComplexityLevel(RegistrationComplexityLevelType value) {
        super(NAME, ((Class) RegistrationComplexityLevelType.class), null, value);
    }

    public RegistrationComplexityLevel() {
        super(NAME, ((Class) RegistrationComplexityLevelType.class), null, null);
    }

}
