
package io.dscope.rosettanet.domain.design.codelist.assemblylevelcode.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AssemblyLevelCode
    extends JAXBElement<AssemblyLevelCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01", "AssemblyLevelCode");

    public AssemblyLevelCode(AssemblyLevelCodeType value) {
        super(NAME, ((Class) AssemblyLevelCodeType.class), null, value);
    }

    public AssemblyLevelCode() {
        super(NAME, ((Class) AssemblyLevelCodeType.class), null, null);
    }

}
