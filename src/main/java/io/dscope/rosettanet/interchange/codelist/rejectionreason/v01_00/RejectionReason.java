
package io.dscope.rosettanet.interchange.codelist.rejectionreason.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RejectionReason
    extends JAXBElement<RejectionReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:RejectionReason:xsd:codelist:01.00", "RejectionReason");

    public RejectionReason(RejectionReasonType value) {
        super(NAME, ((Class) RejectionReasonType.class), null, value);
    }

    public RejectionReason() {
        super(NAME, ((Class) RejectionReasonType.class), null, null);
    }

}
