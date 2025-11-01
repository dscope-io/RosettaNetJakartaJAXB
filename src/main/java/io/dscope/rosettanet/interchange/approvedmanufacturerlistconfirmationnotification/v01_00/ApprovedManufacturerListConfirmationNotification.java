
package io.dscope.rosettanet.interchange.approvedmanufacturerlistconfirmationnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ApprovedManufacturerListConfirmationNotification", namespace = "urn:rosettanet:specification:interchange:ApprovedManufacturerListConfirmationNotification:xsd:schema:01.00")
public class ApprovedManufacturerListConfirmationNotification
    extends JAXBElement<ApprovedManufacturerListConfirmationNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ApprovedManufacturerListConfirmationNotification:xsd:schema:01.00", "ApprovedManufacturerListConfirmationNotification");

    public ApprovedManufacturerListConfirmationNotification(ApprovedManufacturerListConfirmationNotificationType value) {
        super(NAME, ((Class) ApprovedManufacturerListConfirmationNotificationType.class), null, value);
    }

    public ApprovedManufacturerListConfirmationNotification() {
        super(NAME, ((Class) ApprovedManufacturerListConfirmationNotificationType.class), null, null);
    }

}
