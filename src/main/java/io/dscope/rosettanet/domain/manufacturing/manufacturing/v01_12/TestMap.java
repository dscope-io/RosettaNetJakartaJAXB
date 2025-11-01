
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestMap
    extends JAXBElement<TestMapType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12", "TestMap");

    public TestMap(TestMapType value) {
        super(NAME, ((Class) TestMapType.class), null, value);
    }

    public TestMap() {
        super(NAME, ((Class) TestMapType.class), null, null);
    }

}
