
package io.dscope.rosettanet.domain.procurement.codelist.reporttype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReportType
    extends JAXBElement<ReportTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ReportType:xsd:codelist:01.03", "ReportType");

    public ReportType(ReportTypeType value) {
        super(NAME, ((Class) ReportTypeType.class), null, value);
    }

    public ReportType() {
        super(NAME, ((Class) ReportTypeType.class), null, null);
    }

}
