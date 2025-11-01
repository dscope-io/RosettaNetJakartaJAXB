
package io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:1.0", "ProcessTypeA");

    public ProcessTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProcessTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
