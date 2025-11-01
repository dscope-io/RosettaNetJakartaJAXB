
package io.dscope.rosettanet.domain.procurement.codelist.freeonboard.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreeOnBoardA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:FreeOnBoard:xsd:codelist:1.0", "FreeOnBoardA");

    public FreeOnBoardA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FreeOnBoardA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
