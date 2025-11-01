
package io.dscope.rosettanet.domain.procurement.codelist.quotestatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:1.0", "QuoteStatusA");

    public QuoteStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QuoteStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
