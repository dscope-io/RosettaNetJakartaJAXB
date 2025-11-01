
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ECIDReport
    extends JAXBElement<ECIDReportType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "ECIDReport");

    public ECIDReport(ECIDReportType value) {
        super(NAME, ((Class) ECIDReportType.class), null, value);
    }

    public ECIDReport() {
        super(NAME, ((Class) ECIDReportType.class), null, null);
    }

}
