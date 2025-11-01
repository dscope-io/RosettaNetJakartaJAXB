
package io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteAcknowledgmentReason
    extends JAXBElement<QuoteAcknowledgmentReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", "QuoteAcknowledgmentReason");

    public QuoteAcknowledgmentReason(QuoteAcknowledgmentReasonType value) {
        super(NAME, ((Class) QuoteAcknowledgmentReasonType.class), null, value);
    }

    public QuoteAcknowledgmentReason() {
        super(NAME, ((Class) QuoteAcknowledgmentReasonType.class), null, null);
    }

}
