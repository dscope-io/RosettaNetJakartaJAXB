
package io.dscope.rosettanet.domain.procurement.codelist.salesreportdiscrepancycode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SalesReportDiscrepancyCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SalesReportDiscrepancyCode:xsd:codelist:1.0", "SalesReportDiscrepancyCodeA");

    public SalesReportDiscrepancyCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SalesReportDiscrepancyCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
