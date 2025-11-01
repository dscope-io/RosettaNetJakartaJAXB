
package io.dscope.rosettanet.interchange.certificateofanalysisresponsenotification.v01_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "CertificateOfAnalysisResponseNotification", namespace = "urn:rosettanet:specification:interchange:CertificateOfAnalysisResponseNotification:xsd:schema:01.02")
public class CertificateOfAnalysisResponseNotification
    extends JAXBElement<CertificateOfAnalysisResponseNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:CertificateOfAnalysisResponseNotification:xsd:schema:01.02", "CertificateOfAnalysisResponseNotification");

    public CertificateOfAnalysisResponseNotification(CertificateOfAnalysisResponseNotificationType value) {
        super(NAME, ((Class) CertificateOfAnalysisResponseNotificationType.class), null, value);
    }

    public CertificateOfAnalysisResponseNotification() {
        super(NAME, ((Class) CertificateOfAnalysisResponseNotificationType.class), null, null);
    }

}
