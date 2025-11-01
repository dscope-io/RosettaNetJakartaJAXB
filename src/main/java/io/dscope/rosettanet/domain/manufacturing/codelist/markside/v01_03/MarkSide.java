
package io.dscope.rosettanet.domain.manufacturing.codelist.markside.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkSide
    extends JAXBElement<MarkSideType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:01.03", "MarkSide");

    public MarkSide(MarkSideType value) {
        super(NAME, ((Class) MarkSideType.class), null, value);
    }

    public MarkSide() {
        super(NAME, ((Class) MarkSideType.class), null, null);
    }

}
