
package io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RateTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.00", "RateTypeA");

    public RateTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RateTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
