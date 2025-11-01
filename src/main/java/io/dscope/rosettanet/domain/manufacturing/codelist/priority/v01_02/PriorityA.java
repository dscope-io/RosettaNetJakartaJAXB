
package io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PriorityA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.02", "PriorityA");

    public PriorityA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PriorityA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
