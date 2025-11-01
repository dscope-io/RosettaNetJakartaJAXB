
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_06;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CertificateOfAnalysisNotification
    extends JAXBElement<CertificateOfAnalysisNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06", "CertificateOfAnalysisNotification");

    public CertificateOfAnalysisNotification(CertificateOfAnalysisNotificationType value) {
        super(NAME, ((Class) CertificateOfAnalysisNotificationType.class), null, value);
    }

    public CertificateOfAnalysisNotification() {
        super(NAME, ((Class) CertificateOfAnalysisNotificationType.class), null, null);
    }

}
