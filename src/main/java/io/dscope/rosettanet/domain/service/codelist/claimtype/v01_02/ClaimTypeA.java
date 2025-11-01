
package io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ClaimTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", "ClaimTypeA");

    public ClaimTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ClaimTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
