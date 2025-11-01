
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReplacementCompatibility
    extends JAXBElement<ReplacementCompatibilityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", "ReplacementCompatibility");

    public ReplacementCompatibility(ReplacementCompatibilityType value) {
        super(NAME, ((Class) ReplacementCompatibilityType.class), null, value);
    }

    public ReplacementCompatibility() {
        super(NAME, ((Class) ReplacementCompatibilityType.class), null, null);
    }

}
