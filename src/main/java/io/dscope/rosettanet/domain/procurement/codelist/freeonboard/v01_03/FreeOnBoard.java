
package io.dscope.rosettanet.domain.procurement.codelist.freeonboard.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreeOnBoard
    extends JAXBElement<FreeOnBoardType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:FreeOnBoard:xsd:codelist:01.03", "FreeOnBoard");

    public FreeOnBoard(FreeOnBoardType value) {
        super(NAME, ((Class) FreeOnBoardType.class), null, value);
    }

    public FreeOnBoard() {
        super(NAME, ((Class) FreeOnBoardType.class), null, null);
    }

}
