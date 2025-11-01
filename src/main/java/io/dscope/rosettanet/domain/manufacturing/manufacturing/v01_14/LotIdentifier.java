
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotIdentifier
    extends JAXBElement<LotIdentifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "LotIdentifier");

    public LotIdentifier(LotIdentifierType value) {
        super(NAME, ((Class) LotIdentifierType.class), null, value);
    }

    public LotIdentifier() {
        super(NAME, ((Class) LotIdentifierType.class), null, null);
    }

}
