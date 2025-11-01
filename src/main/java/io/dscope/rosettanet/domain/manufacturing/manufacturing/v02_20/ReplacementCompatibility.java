
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReplacementCompatibility
    extends JAXBElement<ReplacementCompatibilityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", "ReplacementCompatibility");

    public ReplacementCompatibility(ReplacementCompatibilityType value) {
        super(NAME, ((Class) ReplacementCompatibilityType.class), null, value);
    }

    public ReplacementCompatibility() {
        super(NAME, ((Class) ReplacementCompatibilityType.class), null, null);
    }

}
