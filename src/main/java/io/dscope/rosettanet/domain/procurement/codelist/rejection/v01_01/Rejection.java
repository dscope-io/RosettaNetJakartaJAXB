
package io.dscope.rosettanet.domain.procurement.codelist.rejection.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Rejection
    extends JAXBElement<RejectionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:Rejection:xsd:codelist:01.01", "Rejection");

    public Rejection(RejectionType value) {
        super(NAME, ((Class) RejectionType.class), null, value);
    }

    public Rejection() {
        super(NAME, ((Class) RejectionType.class), null, null);
    }

}
