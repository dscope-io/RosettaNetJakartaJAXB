
package io.dscope.rosettanet.interchange.quoterequest.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "QuoteRequest", namespace = "urn:rosettanet:specification:interchange:QuoteRequestNotification:xsd:schema:01.00")
public class QuoteRequest
    extends JAXBElement<QuoteRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteRequestNotification:xsd:schema:01.00", "QuoteRequest");

    public QuoteRequest(QuoteRequestType value) {
        super(NAME, ((Class) QuoteRequestType.class), null, value);
    }

    public QuoteRequest() {
        super(NAME, ((Class) QuoteRequestType.class), null, null);
    }

}
