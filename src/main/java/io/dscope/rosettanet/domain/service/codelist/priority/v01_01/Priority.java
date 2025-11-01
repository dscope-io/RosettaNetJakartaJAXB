
package io.dscope.rosettanet.domain.service.codelist.priority.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Priority
    extends JAXBElement<PriorityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:Priority:xsd:codelist:01.01", "Priority");

    public Priority(PriorityType value) {
        super(NAME, ((Class) PriorityType.class), null, value);
    }

    public Priority() {
        super(NAME, ((Class) PriorityType.class), null, null);
    }

}
