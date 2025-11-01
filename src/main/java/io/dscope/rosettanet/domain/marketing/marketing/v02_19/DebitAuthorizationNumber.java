
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DebitAuthorizationNumber
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "DebitAuthorizationNumber");

    public DebitAuthorizationNumber(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public DebitAuthorizationNumber() {
        super(NAME, ((Class) String.class), null, null);
    }

}
