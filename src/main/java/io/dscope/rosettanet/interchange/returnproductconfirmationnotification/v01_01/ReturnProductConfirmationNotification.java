
package io.dscope.rosettanet.interchange.returnproductconfirmationnotification.v01_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ReturnProductConfirmationNotification", namespace = "urn:rosettanet:specification:interchange:ReturnProductConfirmationNotification:xsd:schema:01.01")
public class ReturnProductConfirmationNotification
    extends JAXBElement<ReturnProductConfirmationNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ReturnProductConfirmationNotification:xsd:schema:01.01", "ReturnProductConfirmationNotification");

    public ReturnProductConfirmationNotification(ReturnProductConfirmationNotificationType value) {
        super(NAME, ((Class) ReturnProductConfirmationNotificationType.class), null, value);
    }

    public ReturnProductConfirmationNotification() {
        super(NAME, ((Class) ReturnProductConfirmationNotificationType.class), null, null);
    }

}
