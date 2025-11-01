
package io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuantityChangeCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:1.0", "QuantityChangeCodeA");

    public QuantityChangeCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QuantityChangeCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
