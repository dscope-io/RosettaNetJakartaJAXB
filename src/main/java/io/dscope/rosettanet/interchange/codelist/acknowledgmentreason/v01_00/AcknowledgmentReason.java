
package io.dscope.rosettanet.interchange.codelist.acknowledgmentreason.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AcknowledgmentReason
    extends JAXBElement<AcknowledgmentReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:AcknowledgmentReason:xsd:codelist:01.00", "AcknowledgmentReason");

    public AcknowledgmentReason(AcknowledgmentReasonType value) {
        super(NAME, ((Class) AcknowledgmentReasonType.class), null, value);
    }

    public AcknowledgmentReason() {
        super(NAME, ((Class) AcknowledgmentReasonType.class), null, null);
    }

}
