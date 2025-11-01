
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestSpecificationReport
    extends JAXBElement<TestSpecificationReportType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", "TestSpecificationReport");

    public TestSpecificationReport(TestSpecificationReportType value) {
        super(NAME, ((Class) TestSpecificationReportType.class), null, value);
    }

    public TestSpecificationReport() {
        super(NAME, ((Class) TestSpecificationReportType.class), null, null);
    }

}
