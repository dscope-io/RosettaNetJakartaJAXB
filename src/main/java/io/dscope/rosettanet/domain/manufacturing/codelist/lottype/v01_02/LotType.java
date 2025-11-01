
package io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotType
    extends JAXBElement<LotTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.02", "LotType");

    public LotType(LotTypeType value) {
        super(NAME, ((Class) LotTypeType.class), null, value);
    }

    public LotType() {
        super(NAME, ((Class) LotTypeType.class), null, null);
    }

}
