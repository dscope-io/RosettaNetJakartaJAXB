
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_05;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "CertificateOfAnalysisNotification", namespace = "urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.05")
public class CertificateOfAnalysisNotification
    extends JAXBElement<CertificateOfAnalysisNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.05", "CertificateOfAnalysisNotification");

    public CertificateOfAnalysisNotification(CertificateOfAnalysisNotificationType value) {
        super(NAME, ((Class) CertificateOfAnalysisNotificationType.class), null, value);
    }

    public CertificateOfAnalysisNotification() {
        super(NAME, ((Class) CertificateOfAnalysisNotificationType.class), null, null);
    }

}
