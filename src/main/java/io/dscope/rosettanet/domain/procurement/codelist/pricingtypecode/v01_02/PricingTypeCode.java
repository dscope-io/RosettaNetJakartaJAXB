
package io.dscope.rosettanet.domain.procurement.codelist.pricingtypecode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PricingTypeCode
    extends JAXBElement<PricingTypeCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PricingTypeCode:xsd:codelist:01.02", "PricingTypeCode");

    public PricingTypeCode(PricingTypeCodeType value) {
        super(NAME, ((Class) PricingTypeCodeType.class), null, value);
    }

    public PricingTypeCode() {
        super(NAME, ((Class) PricingTypeCodeType.class), null, null);
    }

}
