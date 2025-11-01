
package io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuantityChangeCode
    extends JAXBElement<QuantityChangeCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:1.0", "QuantityChangeCode");

    public QuantityChangeCode(QuantityChangeCodeType value) {
        super(NAME, ((Class) QuantityChangeCodeType.class), null, value);
    }

    public QuantityChangeCode() {
        super(NAME, ((Class) QuantityChangeCodeType.class), null, null);
    }

}
