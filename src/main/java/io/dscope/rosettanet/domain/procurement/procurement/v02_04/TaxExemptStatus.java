
package io.dscope.rosettanet.domain.procurement.procurement.v02_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxExemptStatus
    extends JAXBElement<TaxExemptStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04", "TaxExemptStatus");

    public TaxExemptStatus(TaxExemptStatusType value) {
        super(NAME, ((Class) TaxExemptStatusType.class), null, value);
    }

    public TaxExemptStatus() {
        super(NAME, ((Class) TaxExemptStatusType.class), null, null);
    }

}
