
package io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotDiscrepancyReason
    extends JAXBElement<LotDiscrepancyReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.02", "LotDiscrepancyReason");

    public LotDiscrepancyReason(LotDiscrepancyReasonType value) {
        super(NAME, ((Class) LotDiscrepancyReasonType.class), null, value);
    }

    public LotDiscrepancyReason() {
        super(NAME, ((Class) LotDiscrepancyReasonType.class), null, null);
    }

}
