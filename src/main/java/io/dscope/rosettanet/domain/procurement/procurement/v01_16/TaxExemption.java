
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxExemption
    extends JAXBElement<TaxExemptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16", "TaxExemption");

    public TaxExemption(TaxExemptionType value) {
        super(NAME, ((Class) TaxExemptionType.class), null, value);
    }

    public TaxExemption() {
        super(NAME, ((Class) TaxExemptionType.class), null, null);
    }

}
