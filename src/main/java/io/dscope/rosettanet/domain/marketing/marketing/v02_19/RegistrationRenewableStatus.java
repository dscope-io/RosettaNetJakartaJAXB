
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationRenewableStatus
    extends JAXBElement<RegistrationRenewableStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "RegistrationRenewableStatus");

    public RegistrationRenewableStatus(RegistrationRenewableStatusType value) {
        super(NAME, ((Class) RegistrationRenewableStatusType.class), null, value);
    }

    public RegistrationRenewableStatus() {
        super(NAME, ((Class) RegistrationRenewableStatusType.class), null, null);
    }

}
