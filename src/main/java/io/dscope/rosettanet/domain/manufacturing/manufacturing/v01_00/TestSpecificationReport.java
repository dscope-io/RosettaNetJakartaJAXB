
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestSpecificationReport
    extends JAXBElement<TestSpecificationReportType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", "TestSpecificationReport");

    public TestSpecificationReport(TestSpecificationReportType value) {
        super(NAME, ((Class) TestSpecificationReportType.class), null, value);
    }

    public TestSpecificationReport() {
        super(NAME, ((Class) TestSpecificationReportType.class), null, null);
    }

}
