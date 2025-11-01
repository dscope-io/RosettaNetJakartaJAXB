
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ECIDReport
    extends JAXBElement<ECIDReportType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", "ECIDReport");

    public ECIDReport(ECIDReportType value) {
        super(NAME, ((Class) ECIDReportType.class), null, value);
    }

    public ECIDReport() {
        super(NAME, ((Class) ECIDReportType.class), null, null);
    }

}
