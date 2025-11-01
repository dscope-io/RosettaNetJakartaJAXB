
package io.dscope.rosettanet.domain.manufacturing.codelist.marktype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkType
    extends JAXBElement<MarkTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:MarkType:xsd:codelist:01.02", "MarkType");

    public MarkType(MarkTypeType value) {
        super(NAME, ((Class) MarkTypeType.class), null, value);
    }

    public MarkType() {
        super(NAME, ((Class) MarkTypeType.class), null, null);
    }

}
