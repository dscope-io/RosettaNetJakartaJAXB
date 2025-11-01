
package io.dscope.rosettanet.domain.service.codelist.claimstatus.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ClaimStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02", "ClaimStatusA");

    public ClaimStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ClaimStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
