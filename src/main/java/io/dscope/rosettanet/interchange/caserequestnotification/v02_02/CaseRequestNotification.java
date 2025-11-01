
package io.dscope.rosettanet.interchange.caserequestnotification.v02_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "CaseRequestNotification", namespace = "urn:rosettanet:specification:interchange:CaseRequestNotification:xsd:schema:02.02")
public class CaseRequestNotification
    extends JAXBElement<CaseRequestNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:CaseRequestNotification:xsd:schema:02.02", "CaseRequestNotification");

    public CaseRequestNotification(CaseRequestNotificationType value) {
        super(NAME, ((Class) CaseRequestNotificationType.class), null, value);
    }

    public CaseRequestNotification() {
        super(NAME, ((Class) CaseRequestNotificationType.class), null, null);
    }

}
