
package io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancyreason.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReceivingDiscrepancyReason
    extends JAXBElement<ReceivingDiscrepancyReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancyReason:xsd:codelist:01.03", "ReceivingDiscrepancyReason");

    public ReceivingDiscrepancyReason(ReceivingDiscrepancyReasonType value) {
        super(NAME, ((Class) ReceivingDiscrepancyReasonType.class), null, value);
    }

    public ReceivingDiscrepancyReason() {
        super(NAME, ((Class) ReceivingDiscrepancyReasonType.class), null, null);
    }

}
