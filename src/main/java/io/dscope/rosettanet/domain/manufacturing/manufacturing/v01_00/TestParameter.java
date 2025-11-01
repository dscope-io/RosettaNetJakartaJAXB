
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestParameter
    extends JAXBElement<TestParameterType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", "TestParameter");

    public TestParameter(TestParameterType value) {
        super(NAME, ((Class) TestParameterType.class), null, value);
    }

    public TestParameter() {
        super(NAME, ((Class) TestParameterType.class), null, null);
    }

}
