
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsDeveloperToolKit
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "IsDeveloperToolKit");

    public IsDeveloperToolKit(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsDeveloperToolKit() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
