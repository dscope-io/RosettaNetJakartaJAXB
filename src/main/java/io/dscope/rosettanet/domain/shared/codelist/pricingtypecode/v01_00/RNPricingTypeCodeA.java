
package io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RNPricingTypeCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.00", "RN_PricingTypeCodeA");

    public RNPricingTypeCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RNPricingTypeCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
