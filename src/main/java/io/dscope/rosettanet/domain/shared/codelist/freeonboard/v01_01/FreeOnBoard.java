
package io.dscope.rosettanet.domain.shared.codelist.freeonboard.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreeOnBoard
    extends JAXBElement<FreeOnBoardType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:FreeOnBoard:xsd:codelist:01.01", "FreeOnBoard");

    public FreeOnBoard(FreeOnBoardType value) {
        super(NAME, ((Class) FreeOnBoardType.class), null, value);
    }

    public FreeOnBoard() {
        super(NAME, ((Class) FreeOnBoardType.class), null, null);
    }

}
