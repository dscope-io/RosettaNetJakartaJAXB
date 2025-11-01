
package io.dscope.rosettanet.domain.procurement.codelist.quotestatus.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuoteStatus
    extends JAXBElement<QuoteStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.02", "QuoteStatus");

    public QuoteStatus(QuoteStatusType value) {
        super(NAME, ((Class) QuoteStatusType.class), null, value);
    }

    public QuoteStatus() {
        super(NAME, ((Class) QuoteStatusType.class), null, null);
    }

}
