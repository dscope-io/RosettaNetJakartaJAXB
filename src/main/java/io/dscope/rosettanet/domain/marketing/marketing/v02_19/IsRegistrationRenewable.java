
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsRegistrationRenewable
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "IsRegistrationRenewable");

    public IsRegistrationRenewable(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsRegistrationRenewable() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
