
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SourceLot
    extends JAXBElement<SourceLotType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "SourceLot");

    public SourceLot(SourceLotType value) {
        super(NAME, ((Class) SourceLotType.class), null, value);
    }

    public SourceLot() {
        super(NAME, ((Class) SourceLotType.class), null, null);
    }

}
