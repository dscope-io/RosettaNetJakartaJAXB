
package io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteAcknowledgmentReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", "QuoteAcknowledgmentReasonA");

    public QuoteAcknowledgmentReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QuoteAcknowledgmentReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
