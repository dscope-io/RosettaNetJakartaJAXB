
package io.dscope.rosettanet.domain.service.service.v02_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReplacedPart
    extends JAXBElement<ReplacedPartType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.14", "ReplacedPart");

    public ReplacedPart(ReplacedPartType value) {
        super(NAME, ((Class) ReplacedPartType.class), null, value);
    }

    public ReplacedPart() {
        super(NAME, ((Class) ReplacedPartType.class), null, null);
    }

}
