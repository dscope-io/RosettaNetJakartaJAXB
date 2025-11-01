
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_10;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "SelfBillingInvoiceNotification", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.10")
public class SelfBillingInvoiceNotification
    extends JAXBElement<SelfBillingInvoiceNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.10", "SelfBillingInvoiceNotification");

    public SelfBillingInvoiceNotification(SelfBillingInvoiceNotificationType value) {
        super(NAME, ((Class) SelfBillingInvoiceNotificationType.class), null, value);
    }

    public SelfBillingInvoiceNotification() {
        super(NAME, ((Class) SelfBillingInvoiceNotificationType.class), null, null);
    }

}
