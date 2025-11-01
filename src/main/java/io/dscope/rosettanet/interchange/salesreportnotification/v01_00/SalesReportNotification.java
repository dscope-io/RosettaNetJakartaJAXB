
package io.dscope.rosettanet.interchange.salesreportnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SalesReportNotification
    extends JAXBElement<SalesReportNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:1.0", "SalesReportNotification");

    public SalesReportNotification(SalesReportNotificationType value) {
        super(NAME, ((Class) SalesReportNotificationType.class), null, value);
    }

    public SalesReportNotification() {
        super(NAME, ((Class) SalesReportNotificationType.class), null, null);
    }

}
