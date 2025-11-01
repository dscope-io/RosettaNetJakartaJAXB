
package io.dscope.rosettanet.interchange.codelist.rejectionreason.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RejectionReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:RejectionReason:xsd:codelist:01.00", "RejectionReasonA");

    public RejectionReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RejectionReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
