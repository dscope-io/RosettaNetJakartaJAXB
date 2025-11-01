
package io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PricingTypeCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03", "PricingTypeCodeA");

    public PricingTypeCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PricingTypeCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
