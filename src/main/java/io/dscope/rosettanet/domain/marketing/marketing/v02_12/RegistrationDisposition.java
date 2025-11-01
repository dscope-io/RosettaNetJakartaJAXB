
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RegistrationDisposition
    extends JAXBElement<RegistrationDispositionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "RegistrationDisposition");

    public RegistrationDisposition(RegistrationDispositionType value) {
        super(NAME, ((Class) RegistrationDispositionType.class), null, value);
    }

    public RegistrationDisposition() {
        super(NAME, ((Class) RegistrationDispositionType.class), null, null);
    }

}
