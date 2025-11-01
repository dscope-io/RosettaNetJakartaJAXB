
package io.dscope.rosettanet.domain.logistics.codelist.markuptype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkUpTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:MarkUpType:xsd:codelist:01.00", "MarkUpTypeA");

    public MarkUpTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public MarkUpTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
