
package io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestResultA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:1.0", "TestResultA");

    public TestResultA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TestResultA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
