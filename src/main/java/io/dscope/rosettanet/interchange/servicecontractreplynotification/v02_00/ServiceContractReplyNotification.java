
package io.dscope.rosettanet.interchange.servicecontractreplynotification.v02_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ServiceContractReplyNotification", namespace = "urn:rosettanet:specification:interchange:ServiceContractReplyNotification:xsd:schema:02.00")
public class ServiceContractReplyNotification
    extends JAXBElement<ServiceContractReplyNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ServiceContractReplyNotification:xsd:schema:02.00", "ServiceContractReplyNotification");

    public ServiceContractReplyNotification(ServiceContractReplyNotificationType value) {
        super(NAME, ((Class) ServiceContractReplyNotificationType.class), null, value);
    }

    public ServiceContractReplyNotification() {
        super(NAME, ((Class) ServiceContractReplyNotificationType.class), null, null);
    }

}
