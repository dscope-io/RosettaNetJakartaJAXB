
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_26;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinalPackageReport
    extends JAXBElement<FinalPackageReportType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26", "FinalPackageReport");

    public FinalPackageReport(FinalPackageReportType value) {
        super(NAME, ((Class) FinalPackageReportType.class), null, value);
    }

    public FinalPackageReport() {
        super(NAME, ((Class) FinalPackageReportType.class), null, null);
    }

}
