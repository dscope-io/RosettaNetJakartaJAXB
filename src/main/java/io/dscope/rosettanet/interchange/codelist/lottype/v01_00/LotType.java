
package io.dscope.rosettanet.interchange.codelist.lottype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotType
    extends JAXBElement<LotTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:LotType:xsd:codelist:01.00", "LotType");

    public LotType(LotTypeType value) {
        super(NAME, ((Class) LotTypeType.class), null, value);
    }

    public LotType() {
        super(NAME, ((Class) LotTypeType.class), null, null);
    }

}
