
package io.dscope.rosettanet.interchange.manufacturingworkorderreplynotification.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ManufacturingWorkOrderReplyNotification", namespace = "urn:rosettanet:specification:interchange:ManufacturingWorkOrderReplyNotification:xsd:schema:02.01")
public class ManufacturingWorkOrderReplyNotification
    extends JAXBElement<ManufacturingWorkOrderReplyNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ManufacturingWorkOrderReplyNotification:xsd:schema:02.01", "ManufacturingWorkOrderReplyNotification");

    public ManufacturingWorkOrderReplyNotification(ManufacturingWorkOrderReplyNotificationType value) {
        super(NAME, ((Class) ManufacturingWorkOrderReplyNotificationType.class), null, value);
    }

    public ManufacturingWorkOrderReplyNotification() {
        super(NAME, ((Class) ManufacturingWorkOrderReplyNotificationType.class), null, null);
    }

}
