
package io.dscope.rosettanet.interchange.planningreleaseforecastnotification.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PlanningReleaseForecastNotification", namespace = "urn:rosettanet:specification:interchange:PlanningReleaseForecastNotification:xsd:schema:02.01")
public class PlanningReleaseForecastNotification
    extends JAXBElement<PlanningReleaseForecastNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PlanningReleaseForecastNotification:xsd:schema:02.01", "PlanningReleaseForecastNotification");

    public PlanningReleaseForecastNotification(PlanningReleaseForecastNotificationType value) {
        super(NAME, ((Class) PlanningReleaseForecastNotificationType.class), null, value);
    }

    public PlanningReleaseForecastNotification() {
        super(NAME, ((Class) PlanningReleaseForecastNotificationType.class), null, null);
    }

}
