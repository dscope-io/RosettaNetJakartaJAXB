
package io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationInvolvementLevelA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", "RegistrationInvolvementLevelA");

    public RegistrationInvolvementLevelA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RegistrationInvolvementLevelA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
