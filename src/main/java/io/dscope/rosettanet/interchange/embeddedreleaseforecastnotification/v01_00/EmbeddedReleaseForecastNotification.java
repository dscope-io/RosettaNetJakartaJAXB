
package io.dscope.rosettanet.interchange.embeddedreleaseforecastnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "EmbeddedReleaseForecastNotification", namespace = "urn:rosettanet:specification:interchange:EmbeddedReleaseForecastNotification:xsd:schema:01.00")
public class EmbeddedReleaseForecastNotification
    extends JAXBElement<EmbeddedReleaseForecastNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:EmbeddedReleaseForecastNotification:xsd:schema:01.00", "EmbeddedReleaseForecastNotification");

    public EmbeddedReleaseForecastNotification(EmbeddedReleaseForecastNotificationType value) {
        super(NAME, ((Class) EmbeddedReleaseForecastNotificationType.class), null, value);
    }

    public EmbeddedReleaseForecastNotification() {
        super(NAME, ((Class) EmbeddedReleaseForecastNotificationType.class), null, null);
    }

}
