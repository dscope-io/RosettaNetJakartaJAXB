
package io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Priority
    extends JAXBElement<PriorityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:1.0", "Priority");

    public Priority(PriorityType value) {
        super(NAME, ((Class) PriorityType.class), null, value);
    }

    public Priority() {
        super(NAME, ((Class) PriorityType.class), null, null);
    }

}
