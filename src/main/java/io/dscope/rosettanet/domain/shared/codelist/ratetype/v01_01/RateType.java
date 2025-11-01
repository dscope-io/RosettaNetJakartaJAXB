
package io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RateType
    extends JAXBElement<RateTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.01", "RateType");

    public RateType(RateTypeType value) {
        super(NAME, ((Class) RateTypeType.class), null, value);
    }

    public RateType() {
        super(NAME, ((Class) RateTypeType.class), null, null);
    }

}
