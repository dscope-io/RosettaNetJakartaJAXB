
package io.dscope.rosettanet.domain.marketing.codelist.registrationstatuscode.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationStatusCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:RegistrationStatusCode:xsd:codelist:01.03", "RegistrationStatusCodeA");

    public RegistrationStatusCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RegistrationStatusCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
