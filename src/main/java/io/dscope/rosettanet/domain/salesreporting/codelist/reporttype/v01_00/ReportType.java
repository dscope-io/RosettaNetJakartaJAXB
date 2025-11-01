
package io.dscope.rosettanet.domain.salesreporting.codelist.reporttype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReportType
    extends JAXBElement<ReportTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:ReportType:xsd:codelist:1.0", "ReportType");

    public ReportType(ReportTypeType value) {
        super(NAME, ((Class) ReportTypeType.class), null, value);
    }

    public ReportType() {
        super(NAME, ((Class) ReportTypeType.class), null, null);
    }

}
