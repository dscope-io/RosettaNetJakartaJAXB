
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsRegisterable
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "IsRegisterable");

    public IsRegisterable(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsRegisterable() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
