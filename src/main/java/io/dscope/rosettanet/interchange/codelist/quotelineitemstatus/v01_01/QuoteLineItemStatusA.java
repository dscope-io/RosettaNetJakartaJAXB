
package io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteLineItemStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.01", "QuoteLineItemStatusA");

    public QuoteLineItemStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QuoteLineItemStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
