
package io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CompletionStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.02", "CompletionStatusA");

    public CompletionStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CompletionStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
