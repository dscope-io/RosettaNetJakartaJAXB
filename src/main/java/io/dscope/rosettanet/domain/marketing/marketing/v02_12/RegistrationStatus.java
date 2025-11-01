
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationStatus
    extends JAXBElement<RegistrationStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "RegistrationStatus");

    public RegistrationStatus(RegistrationStatusType value) {
        super(NAME, ((Class) RegistrationStatusType.class), null, value);
    }

    public RegistrationStatus() {
        super(NAME, ((Class) RegistrationStatusType.class), null, null);
    }

}
