
package io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.02", "QuoteTypeA");

    public QuoteTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QuoteTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
