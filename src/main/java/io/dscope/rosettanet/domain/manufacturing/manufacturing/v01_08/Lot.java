
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_08;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Lot
    extends JAXBElement<LotType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.08", "Lot");

    public Lot(LotType value) {
        super(NAME, ((Class) LotType.class), null, value);
    }

    public Lot() {
        super(NAME, ((Class) LotType.class), null, null);
    }

}
