
package io.dscope.rosettanet.domain.shared.shared.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Rate
    extends JAXBElement<RateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", "Rate");

    public Rate(RateType value) {
        super(NAME, ((Class) RateType.class), null, value);
    }

    public Rate() {
        super(NAME, ((Class) RateType.class), null, null);
    }

}
