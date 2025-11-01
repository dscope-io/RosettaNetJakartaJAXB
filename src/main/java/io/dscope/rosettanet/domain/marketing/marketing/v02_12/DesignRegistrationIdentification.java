
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignRegistrationIdentification
    extends JAXBElement<DesignRegistrationIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "DesignRegistrationIdentification");

    public DesignRegistrationIdentification(DesignRegistrationIdentificationType value) {
        super(NAME, ((Class) DesignRegistrationIdentificationType.class), null, value);
    }

    public DesignRegistrationIdentification() {
        super(NAME, ((Class) DesignRegistrationIdentificationType.class), null, null);
    }

}
