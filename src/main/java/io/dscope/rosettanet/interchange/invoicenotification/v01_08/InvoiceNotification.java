
package io.dscope.rosettanet.interchange.invoicenotification.v01_08;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "InvoiceNotification", namespace = "urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.08")
public class InvoiceNotification
    extends JAXBElement<InvoiceNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.08", "InvoiceNotification");

    public InvoiceNotification(InvoiceNotificationType value) {
        super(NAME, ((Class) InvoiceNotificationType.class), null, value);
    }

    public InvoiceNotification() {
        super(NAME, ((Class) InvoiceNotificationType.class), null, null);
    }

}
