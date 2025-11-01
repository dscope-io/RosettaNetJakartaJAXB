
package io.dscope.rosettanet.interchange.codelist.parttype.v02_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PartType
    extends JAXBElement<PartTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00", "PartType");

    public PartType(PartTypeType value) {
        super(NAME, ((Class) PartTypeType.class), null, value);
    }

    public PartType() {
        super(NAME, ((Class) PartTypeType.class), null, null);
    }

}
