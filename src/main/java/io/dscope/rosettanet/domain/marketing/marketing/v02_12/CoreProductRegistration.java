
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CoreProductRegistration
    extends JAXBElement<CoreProductRegistrationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "CoreProductRegistration");

    public CoreProductRegistration(CoreProductRegistrationType value) {
        super(NAME, ((Class) CoreProductRegistrationType.class), null, value);
    }

    public CoreProductRegistration() {
        super(NAME, ((Class) CoreProductRegistrationType.class), null, null);
    }

}
