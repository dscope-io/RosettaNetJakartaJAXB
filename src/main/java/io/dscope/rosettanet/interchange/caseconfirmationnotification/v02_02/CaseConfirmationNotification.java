
package io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "CaseConfirmationNotification", namespace = "urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02")
public class CaseConfirmationNotification
    extends JAXBElement<CaseConfirmationNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02", "CaseConfirmationNotification");

    public CaseConfirmationNotification(CaseConfirmationNotificationType value) {
        super(NAME, ((Class) CaseConfirmationNotificationType.class), null, value);
    }

    public CaseConfirmationNotification() {
        super(NAME, ((Class) CaseConfirmationNotificationType.class), null, null);
    }

}
