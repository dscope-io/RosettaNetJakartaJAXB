
package io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteLineItemStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.00", "QuoteLineItemStatusA");

    public QuoteLineItemStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QuoteLineItemStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
