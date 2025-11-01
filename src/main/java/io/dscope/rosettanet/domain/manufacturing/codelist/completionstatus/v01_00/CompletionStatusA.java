
package io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CompletionStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:1.0", "CompletionStatusA");

    public CompletionStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CompletionStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
