
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "SemiconductorTestDataNotification", namespace = "urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02")
public class SemiconductorTestDataNotification
    extends JAXBElement<SemiconductorTestDataNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02", "SemiconductorTestDataNotification");

    public SemiconductorTestDataNotification(SemiconductorTestDataNotificationType value) {
        super(NAME, ((Class) SemiconductorTestDataNotificationType.class), null, value);
    }

    public SemiconductorTestDataNotification() {
        super(NAME, ((Class) SemiconductorTestDataNotificationType.class), null, null);
    }

}
