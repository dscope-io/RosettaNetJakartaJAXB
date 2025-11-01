
package io.dscope.rosettanet.interchange.invoicerejectnotification.v02_03;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "InvoiceRejectNotification", namespace = "urn:rosettanet:specification:interchange:InvoiceRejectNotification:xsd:schema:02.03")
public class InvoiceRejectNotification
    extends JAXBElement<InvoiceRejectNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:InvoiceRejectNotification:xsd:schema:02.03", "InvoiceRejectNotification");

    public InvoiceRejectNotification(InvoiceRejectNotificationType value) {
        super(NAME, ((Class) InvoiceRejectNotificationType.class), null, value);
    }

    public InvoiceRejectNotification() {
        super(NAME, ((Class) InvoiceRejectNotificationType.class), null, null);
    }

}
