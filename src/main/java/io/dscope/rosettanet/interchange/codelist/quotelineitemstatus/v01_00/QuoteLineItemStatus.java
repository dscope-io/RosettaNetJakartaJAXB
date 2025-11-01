
package io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteLineItemStatus
    extends JAXBElement<QuoteLineItemStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.00", "QuoteLineItemStatus");

    public QuoteLineItemStatus(QuoteLineItemStatusType value) {
        super(NAME, ((Class) QuoteLineItemStatusType.class), null, value);
    }

    public QuoteLineItemStatus() {
        super(NAME, ((Class) QuoteLineItemStatusType.class), null, null);
    }

}
