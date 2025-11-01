
package io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NotificationTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04", "NotificationTypeA");

    public NotificationTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public NotificationTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
