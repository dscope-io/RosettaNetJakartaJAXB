
package io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotDiscrepancyReason
    extends JAXBElement<LotDiscrepancyReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:1.0", "LotDiscrepancyReason");

    public LotDiscrepancyReason(LotDiscrepancyReasonType value) {
        super(NAME, ((Class) LotDiscrepancyReasonType.class), null, value);
    }

    public LotDiscrepancyReason() {
        super(NAME, ((Class) LotDiscrepancyReasonType.class), null, null);
    }

}
