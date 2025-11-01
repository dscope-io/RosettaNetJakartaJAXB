
package io.dscope.rosettanet.domain.manufacturing.codelist.replacementcompatibilitycode.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReplacementCompatibilityCode
    extends JAXBElement<ReplacementCompatibilityCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ReplacementCompatibilityCode:xsd:codelist:01.01", "ReplacementCompatibilityCode");

    public ReplacementCompatibilityCode(ReplacementCompatibilityCodeType value) {
        super(NAME, ((Class) ReplacementCompatibilityCodeType.class), null, value);
    }

    public ReplacementCompatibilityCode() {
        super(NAME, ((Class) ReplacementCompatibilityCodeType.class), null, null);
    }

}
