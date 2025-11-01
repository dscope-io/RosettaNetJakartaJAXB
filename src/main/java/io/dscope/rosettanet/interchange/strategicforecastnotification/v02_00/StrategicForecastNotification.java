
package io.dscope.rosettanet.interchange.strategicforecastnotification.v02_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "StrategicForecastNotification", namespace = "urn:rosettanet:specification:interchange:StrategicForecastNotification:xsd:schema:02.00")
public class StrategicForecastNotification
    extends JAXBElement<StrategicForecastNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:StrategicForecastNotification:xsd:schema:02.00", "StrategicForecastNotification");

    public StrategicForecastNotification(StrategicForecastNotificationType value) {
        super(NAME, ((Class) StrategicForecastNotificationType.class), null, value);
    }

    public StrategicForecastNotification() {
        super(NAME, ((Class) StrategicForecastNotificationType.class), null, null);
    }

}
