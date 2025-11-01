
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxSummary
    extends JAXBElement<TaxSummaryType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "TaxSummary");

    public TaxSummary(TaxSummaryType value) {
        super(NAME, ((Class) TaxSummaryType.class), null, value);
    }

    public TaxSummary() {
        super(NAME, ((Class) TaxSummaryType.class), null, null);
    }

}
