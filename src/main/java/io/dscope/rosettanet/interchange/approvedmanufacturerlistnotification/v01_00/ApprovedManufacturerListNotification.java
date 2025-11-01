
package io.dscope.rosettanet.interchange.approvedmanufacturerlistnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ApprovedManufacturerListNotification", namespace = "urn:rosettanet:specification:interchange:ApprovedManufacturerListNotification:xsd:schema:01.00")
public class ApprovedManufacturerListNotification
    extends JAXBElement<ApprovedManufacturerListNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ApprovedManufacturerListNotification:xsd:schema:01.00", "ApprovedManufacturerListNotification");

    public ApprovedManufacturerListNotification(ApprovedManufacturerListNotificationType value) {
        super(NAME, ((Class) ApprovedManufacturerListNotificationType.class), null, value);
    }

    public ApprovedManufacturerListNotification() {
        super(NAME, ((Class) ApprovedManufacturerListNotificationType.class), null, null);
    }

}
