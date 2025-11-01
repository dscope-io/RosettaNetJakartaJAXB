
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocessparttype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WorkInProcessPartTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WorkInProcessPartType:xsd:codelist:01.03", "WorkInProcessPartTypeA");

    public WorkInProcessPartTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WorkInProcessPartTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
