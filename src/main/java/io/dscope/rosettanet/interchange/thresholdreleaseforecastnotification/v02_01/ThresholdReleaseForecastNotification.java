
package io.dscope.rosettanet.interchange.thresholdreleaseforecastnotification.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ThresholdReleaseForecastNotification", namespace = "urn:rosettanet:specification:interchange:ThresholdReleaseForecastNotification:xsd:schema:02.01")
public class ThresholdReleaseForecastNotification
    extends JAXBElement<ThresholdReleaseForecastNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ThresholdReleaseForecastNotification:xsd:schema:02.01", "ThresholdReleaseForecastNotification");

    public ThresholdReleaseForecastNotification(ThresholdReleaseForecastNotificationType value) {
        super(NAME, ((Class) ThresholdReleaseForecastNotificationType.class), null, value);
    }

    public ThresholdReleaseForecastNotification() {
        super(NAME, ((Class) ThresholdReleaseForecastNotificationType.class), null, null);
    }

}
