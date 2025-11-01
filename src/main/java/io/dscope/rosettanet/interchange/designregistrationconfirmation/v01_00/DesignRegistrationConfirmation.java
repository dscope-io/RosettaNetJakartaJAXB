
package io.dscope.rosettanet.interchange.designregistrationconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "DesignRegistrationConfirmation", namespace = "urn:rosettanet:specification:interchange:DesignRegistrationConfirmationNotification:xsd:schema:01.00")
public class DesignRegistrationConfirmation
    extends JAXBElement<DesignRegistrationConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:DesignRegistrationConfirmationNotification:xsd:schema:01.00", "DesignRegistrationConfirmation");

    public DesignRegistrationConfirmation(DesignRegistrationConfirmationType value) {
        super(NAME, ((Class) DesignRegistrationConfirmationType.class), null, value);
    }

    public DesignRegistrationConfirmation() {
        super(NAME, ((Class) DesignRegistrationConfirmationType.class), null, null);
    }

}
