
package io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RNPricingTypeCode
    extends JAXBElement<RNPricingTypeCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.00", "RN_PricingTypeCode");

    public RNPricingTypeCode(RNPricingTypeCodeType value) {
        super(NAME, ((Class) RNPricingTypeCodeType.class), null, value);
    }

    public RNPricingTypeCode() {
        super(NAME, ((Class) RNPricingTypeCodeType.class), null, null);
    }

}
