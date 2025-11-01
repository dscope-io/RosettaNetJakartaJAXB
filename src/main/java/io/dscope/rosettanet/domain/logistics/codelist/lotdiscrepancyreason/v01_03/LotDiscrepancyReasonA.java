
package io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotDiscrepancyReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.03", "LotDiscrepancyReasonA");

    public LotDiscrepancyReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LotDiscrepancyReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
