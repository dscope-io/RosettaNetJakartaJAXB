
package io.dscope.rosettanet.domain.service.codelist.claimstatus.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ClaimStatus
    extends JAXBElement<ClaimStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02", "ClaimStatus");

    public ClaimStatus(ClaimStatusType value) {
        super(NAME, ((Class) ClaimStatusType.class), null, value);
    }

    public ClaimStatus() {
        super(NAME, ((Class) ClaimStatusType.class), null, null);
    }

}
