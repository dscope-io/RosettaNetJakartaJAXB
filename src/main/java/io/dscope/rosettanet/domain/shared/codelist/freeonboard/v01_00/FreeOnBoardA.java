
package io.dscope.rosettanet.domain.shared.codelist.freeonboard.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreeOnBoardA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:FreeOnBoard:xsd:codelist:01.00", "FreeOnBoardA");

    public FreeOnBoardA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FreeOnBoardA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
