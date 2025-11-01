
package io.dscope.rosettanet.domain.manufacturing.codelist.lotstatus.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:01.02", "LotStatusA");

    public LotStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LotStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
