
package io.dscope.rosettanet.interchange.consumptionnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ConsumptionNotification", namespace = "urn:rosettanet:specification:interchange:ConsumptionNotification:xsd:schema:01.00")
public class ConsumptionNotification
    extends JAXBElement<ConsumptionNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ConsumptionNotification:xsd:schema:01.00", "ConsumptionNotification");

    public ConsumptionNotification(ConsumptionNotificationType value) {
        super(NAME, ((Class) ConsumptionNotificationType.class), null, value);
    }

    public ConsumptionNotification() {
        super(NAME, ((Class) ConsumptionNotificationType.class), null, null);
    }

}
