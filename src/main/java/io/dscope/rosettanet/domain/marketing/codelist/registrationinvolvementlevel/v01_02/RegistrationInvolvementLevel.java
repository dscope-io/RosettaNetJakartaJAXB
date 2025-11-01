
package io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationInvolvementLevel
    extends JAXBElement<RegistrationInvolvementLevelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", "RegistrationInvolvementLevel");

    public RegistrationInvolvementLevel(RegistrationInvolvementLevelType value) {
        super(NAME, ((Class) RegistrationInvolvementLevelType.class), null, value);
    }

    public RegistrationInvolvementLevel() {
        super(NAME, ((Class) RegistrationInvolvementLevelType.class), null, null);
    }

}
