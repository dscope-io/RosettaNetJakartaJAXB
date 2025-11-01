
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BuildInfoReport
    extends JAXBElement<BuildInfoReportType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", "BuildInfoReport");

    public BuildInfoReport(BuildInfoReportType value) {
        super(NAME, ((Class) BuildInfoReportType.class), null, value);
    }

    public BuildInfoReport() {
        super(NAME, ((Class) BuildInfoReportType.class), null, null);
    }

}
