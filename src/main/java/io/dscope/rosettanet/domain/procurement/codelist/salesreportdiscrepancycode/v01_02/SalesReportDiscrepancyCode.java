
package io.dscope.rosettanet.domain.procurement.codelist.salesreportdiscrepancycode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SalesReportDiscrepancyCode
    extends JAXBElement<SalesReportDiscrepancyCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SalesReportDiscrepancyCode:xsd:codelist:01.02", "SalesReportDiscrepancyCode");

    public SalesReportDiscrepancyCode(SalesReportDiscrepancyCodeType value) {
        super(NAME, ((Class) SalesReportDiscrepancyCodeType.class), null, value);
    }

    public SalesReportDiscrepancyCode() {
        super(NAME, ((Class) SalesReportDiscrepancyCodeType.class), null, null);
    }

}
