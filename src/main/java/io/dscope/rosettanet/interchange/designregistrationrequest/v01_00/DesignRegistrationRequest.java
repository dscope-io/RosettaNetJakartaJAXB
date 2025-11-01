
package io.dscope.rosettanet.interchange.designregistrationrequest.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "DesignRegistrationRequest", namespace = "urn:rosettanet:specification:interchange:DesignRegistrationRequestNotification:xsd:schema:01.00")
public class DesignRegistrationRequest
    extends JAXBElement<DesignRegistrationRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:DesignRegistrationRequestNotification:xsd:schema:01.00", "DesignRegistrationRequest");

    public DesignRegistrationRequest(DesignRegistrationRequestType value) {
        super(NAME, ((Class) DesignRegistrationRequestType.class), null, value);
    }

    public DesignRegistrationRequest() {
        super(NAME, ((Class) DesignRegistrationRequestType.class), null, null);
    }

}
