
package io.dscope.rosettanet.domain.marketing.codelist.registrationstatuscode.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationStatusCode
    extends JAXBElement<RegistrationStatusCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:RegistrationStatusCode:xsd:codelist:01.03", "RegistrationStatusCode");

    public RegistrationStatusCode(RegistrationStatusCodeType value) {
        super(NAME, ((Class) RegistrationStatusCodeType.class), null, value);
    }

    public RegistrationStatusCode() {
        super(NAME, ((Class) RegistrationStatusCodeType.class), null, null);
    }

}
