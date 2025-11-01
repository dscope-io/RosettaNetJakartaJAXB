
package io.dscope.rosettanet.domain.manufacturing.codelist.marktype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:MarkType:xsd:codelist:01.03", "MarkTypeA");

    public MarkTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public MarkTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
