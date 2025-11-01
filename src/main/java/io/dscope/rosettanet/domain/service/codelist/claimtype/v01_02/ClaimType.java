
package io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ClaimType
    extends JAXBElement<ClaimTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", "ClaimType");

    public ClaimType(ClaimTypeType value) {
        super(NAME, ((Class) ClaimTypeType.class), null, value);
    }

    public ClaimType() {
        super(NAME, ((Class) ClaimTypeType.class), null, null);
    }

}
