
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ServiceEntitlementStatusResponse", namespace = "urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00")
public class ServiceEntitlementStatusResponse
    extends JAXBElement<ServiceEntitlementStatusResponseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00", "ServiceEntitlementStatusResponse");

    public ServiceEntitlementStatusResponse(ServiceEntitlementStatusResponseType value) {
        super(NAME, ((Class) ServiceEntitlementStatusResponseType.class), null, value);
    }

    public ServiceEntitlementStatusResponse() {
        super(NAME, ((Class) ServiceEntitlementStatusResponseType.class), null, null);
    }

}
