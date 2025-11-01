
package io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04", "LotTypeA");

    public LotTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LotTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
