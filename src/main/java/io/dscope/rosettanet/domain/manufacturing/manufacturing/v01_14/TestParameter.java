
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestParameter
    extends JAXBElement<TestParameterType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "TestParameter");

    public TestParameter(TestParameterType value) {
        super(NAME, ((Class) TestParameterType.class), null, value);
    }

    public TestParameter() {
        super(NAME, ((Class) TestParameterType.class), null, null);
    }

}
