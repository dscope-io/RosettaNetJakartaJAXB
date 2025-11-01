
package io.dscope.rosettanet.domain.manufacturing.codelist.replacementcompatibilitycode.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReplacementCompatibilityCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ReplacementCompatibilityCode:xsd:codelist:01.01", "ReplacementCompatibilityCodeA");

    public ReplacementCompatibilityCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ReplacementCompatibilityCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
