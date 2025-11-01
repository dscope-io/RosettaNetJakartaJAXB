
package io.dscope.rosettanet.domain.service.codelist.notificationcode.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NotificationCode
    extends JAXBElement<NotificationCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", "NotificationCode");

    public NotificationCode(NotificationCodeType value) {
        super(NAME, ((Class) NotificationCodeType.class), null, value);
    }

    public NotificationCode() {
        super(NAME, ((Class) NotificationCodeType.class), null, null);
    }

}
