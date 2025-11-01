
package io.dscope.rosettanet.domain.procurement.codelist.rejection.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RejectionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:Rejection:xsd:codelist:01.00", "RejectionA");

    public RejectionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RejectionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
