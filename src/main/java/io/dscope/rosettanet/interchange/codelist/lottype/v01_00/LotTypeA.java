
package io.dscope.rosettanet.interchange.codelist.lottype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:LotType:xsd:codelist:01.00", "LotTypeA");

    public LotTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LotTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
