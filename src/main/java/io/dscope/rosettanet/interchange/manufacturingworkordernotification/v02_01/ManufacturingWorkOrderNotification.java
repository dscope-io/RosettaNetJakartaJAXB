
package io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ManufacturingWorkOrderNotification", namespace = "urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.01")
public class ManufacturingWorkOrderNotification
    extends JAXBElement<ManufacturingWorkOrderNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.01", "ManufacturingWorkOrderNotification");

    public ManufacturingWorkOrderNotification(ManufacturingWorkOrderNotificationType value) {
        super(NAME, ((Class) ManufacturingWorkOrderNotificationType.class), null, value);
    }

    public ManufacturingWorkOrderNotification() {
        super(NAME, ((Class) ManufacturingWorkOrderNotificationType.class), null, null);
    }

}
