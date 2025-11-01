
package io.dscope.rosettanet.interchange.forecastreplynotification.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ForecastReplyNotification", namespace = "urn:rosettanet:specification:interchange:ForecastReplyNotification:xsd:schema:02.01")
public class ForecastReplyNotification
    extends JAXBElement<ForecastReplyNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ForecastReplyNotification:xsd:schema:02.01", "ForecastReplyNotification");

    public ForecastReplyNotification(ForecastReplyNotificationType value) {
        super(NAME, ((Class) ForecastReplyNotificationType.class), null, value);
    }

    public ForecastReplyNotification() {
        super(NAME, ((Class) ForecastReplyNotificationType.class), null, null);
    }

}
