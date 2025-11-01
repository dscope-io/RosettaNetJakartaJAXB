
package io.dscope.rosettanet.domain.marketing.codelist.designregistrationnotification.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignRegistrationNotification
    extends JAXBElement<DesignRegistrationNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:DesignRegistrationNotification:xsd:codelist:01.02", "DesignRegistrationNotification");

    public DesignRegistrationNotification(DesignRegistrationNotificationType value) {
        super(NAME, ((Class) DesignRegistrationNotificationType.class), null, value);
    }

    public DesignRegistrationNotification() {
        super(NAME, ((Class) DesignRegistrationNotificationType.class), null, null);
    }

}
