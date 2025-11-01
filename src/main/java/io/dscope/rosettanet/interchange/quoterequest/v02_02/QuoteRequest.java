
package io.dscope.rosettanet.interchange.quoterequest.v02_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "QuoteRequest", namespace = "urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.02")
public class QuoteRequest
    extends JAXBElement<QuoteRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:02.02", "QuoteRequest");

    public QuoteRequest(QuoteRequestType value) {
        super(NAME, ((Class) QuoteRequestType.class), null, value);
    }

    public QuoteRequest() {
        super(NAME, ((Class) QuoteRequestType.class), null, null);
    }

}
