
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "QuoteConfirmation", namespace = "urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00")
public class QuoteConfirmation
    extends JAXBElement<QuoteConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00", "QuoteConfirmation");

    public QuoteConfirmation(QuoteConfirmationType value) {
        super(NAME, ((Class) QuoteConfirmationType.class), null, value);
    }

    public QuoteConfirmation() {
        super(NAME, ((Class) QuoteConfirmationType.class), null, null);
    }

}
