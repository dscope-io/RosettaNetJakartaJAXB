
package io.dscope.rosettanet.interchange.servicecontractrequestnotification.v01_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ServiceContractRequestNotification", namespace = "urn:rosettanet:specification:interchange:ServiceContractRequestNotification:xsd:schema:01.01")
public class ServiceContractRequestNotification
    extends JAXBElement<ServiceContractRequestNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ServiceContractRequestNotification:xsd:schema:01.01", "ServiceContractRequestNotification");

    public ServiceContractRequestNotification(ServiceContractRequestNotificationType value) {
        super(NAME, ((Class) ServiceContractRequestNotificationType.class), null, value);
    }

    public ServiceContractRequestNotification() {
        super(NAME, ((Class) ServiceContractRequestNotificationType.class), null, null);
    }

}
