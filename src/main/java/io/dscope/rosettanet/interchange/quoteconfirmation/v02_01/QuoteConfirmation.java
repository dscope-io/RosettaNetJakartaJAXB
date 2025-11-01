
package io.dscope.rosettanet.interchange.quoteconfirmation.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "QuoteConfirmation", namespace = "urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01")
public class QuoteConfirmation
    extends JAXBElement<QuoteConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01", "QuoteConfirmation");

    public QuoteConfirmation(QuoteConfirmationType value) {
        super(NAME, ((Class) QuoteConfirmationType.class), null, value);
    }

    public QuoteConfirmation() {
        super(NAME, ((Class) QuoteConfirmationType.class), null, null);
    }

}
