
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotQuantity
    extends JAXBElement<LotQuantityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "LotQuantity");

    public LotQuantity(LotQuantityType value) {
        super(NAME, ((Class) LotQuantityType.class), null, value);
    }

    public LotQuantity() {
        super(NAME, ((Class) LotQuantityType.class), null, null);
    }

}
