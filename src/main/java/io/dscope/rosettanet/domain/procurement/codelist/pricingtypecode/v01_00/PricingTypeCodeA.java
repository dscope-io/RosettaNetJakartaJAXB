
package io.dscope.rosettanet.domain.procurement.codelist.pricingtypecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PricingTypeCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PricingTypeCode:xsd:codelist:1.0", "PricingTypeCodeA");

    public PricingTypeCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PricingTypeCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
