
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferLotQuantity
    extends JAXBElement<WaferLotQuantityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", "WaferLotQuantity");

    public WaferLotQuantity(WaferLotQuantityType value) {
        super(NAME, ((Class) WaferLotQuantityType.class), null, value);
    }

    public WaferLotQuantity() {
        super(NAME, ((Class) WaferLotQuantityType.class), null, null);
    }

}
