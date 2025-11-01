
package io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NotificationType
    extends JAXBElement<NotificationTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04", "NotificationType");

    public NotificationType(NotificationTypeType value) {
        super(NAME, ((Class) NotificationTypeType.class), null, value);
    }

    public NotificationType() {
        super(NAME, ((Class) NotificationTypeType.class), null, null);
    }

}
