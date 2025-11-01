
package io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuantityChangeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:01.04", "QuantityChangeA");

    public QuantityChangeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QuantityChangeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
