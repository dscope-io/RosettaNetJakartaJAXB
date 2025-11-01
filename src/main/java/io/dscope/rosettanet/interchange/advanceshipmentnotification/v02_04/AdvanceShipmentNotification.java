
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_04;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "AdvanceShipmentNotification", namespace = "urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.04")
public class AdvanceShipmentNotification
    extends JAXBElement<AdvanceShipmentNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.04", "AdvanceShipmentNotification");

    public AdvanceShipmentNotification(AdvanceShipmentNotificationType value) {
        super(NAME, ((Class) AdvanceShipmentNotificationType.class), null, value);
    }

    public AdvanceShipmentNotification() {
        super(NAME, ((Class) AdvanceShipmentNotificationType.class), null, null);
    }

}
