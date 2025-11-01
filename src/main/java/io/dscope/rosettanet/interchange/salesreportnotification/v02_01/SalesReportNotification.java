
package io.dscope.rosettanet.interchange.salesreportnotification.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "SalesReportNotification", namespace = "urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:02.01")
public class SalesReportNotification
    extends JAXBElement<SalesReportNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:02.01", "SalesReportNotification");

    public SalesReportNotification(SalesReportNotificationType value) {
        super(NAME, ((Class) SalesReportNotificationType.class), null, value);
    }

    public SalesReportNotification() {
        super(NAME, ((Class) SalesReportNotificationType.class), null, null);
    }

}
