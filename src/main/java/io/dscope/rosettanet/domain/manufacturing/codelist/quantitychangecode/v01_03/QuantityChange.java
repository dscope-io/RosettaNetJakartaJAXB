
package io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuantityChange
    extends JAXBElement<QuantityChangeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:01.03", "QuantityChange");

    public QuantityChange(QuantityChangeType value) {
        super(NAME, ((Class) QuantityChangeType.class), null, value);
    }

    public QuantityChange() {
        super(NAME, ((Class) QuantityChangeType.class), null, null);
    }

}
