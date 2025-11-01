
package io.dscope.rosettanet.domain.marketing.codelist.designregistrationnotification.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignRegistrationNotificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:DesignRegistrationNotification:xsd:codelist:01.02", "DesignRegistrationNotificationA");

    public DesignRegistrationNotificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DesignRegistrationNotificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
