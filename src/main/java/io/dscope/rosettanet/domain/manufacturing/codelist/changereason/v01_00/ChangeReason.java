
package io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ChangeReason
    extends JAXBElement<ChangeReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:1.0", "ChangeReason");

    public ChangeReason(ChangeReasonType value) {
        super(NAME, ((Class) ChangeReasonType.class), null, value);
    }

    public ChangeReason() {
        super(NAME, ((Class) ChangeReasonType.class), null, null);
    }

}
