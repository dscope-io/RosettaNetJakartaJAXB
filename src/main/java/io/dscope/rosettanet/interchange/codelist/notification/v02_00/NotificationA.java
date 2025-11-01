
package io.dscope.rosettanet.interchange.codelist.notification.v02_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NotificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:Notification:xsd:codelist:02.00", "NotificationA");

    public NotificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public NotificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
