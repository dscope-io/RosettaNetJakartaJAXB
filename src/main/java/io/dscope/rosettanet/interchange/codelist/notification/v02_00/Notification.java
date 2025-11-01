
package io.dscope.rosettanet.interchange.codelist.notification.v02_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Notification
    extends JAXBElement<NotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:Notification:xsd:codelist:02.00", "Notification");

    public Notification(NotificationType value) {
        super(NAME, ((Class) NotificationType.class), null, value);
    }

    public Notification() {
        super(NAME, ((Class) NotificationType.class), null, null);
    }

}
