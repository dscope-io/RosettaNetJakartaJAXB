
package io.dscope.rosettanet.domain.service.codelist.notificationcode.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NotificationCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", "NotificationCodeA");

    public NotificationCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public NotificationCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
