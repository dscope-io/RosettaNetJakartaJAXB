
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SourceLot
    extends JAXBElement<SourceLotType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", "SourceLot");

    public SourceLot(SourceLotType value) {
        super(NAME, ((Class) SourceLotType.class), null, value);
    }

    public SourceLot() {
        super(NAME, ((Class) SourceLotType.class), null, null);
    }

}
