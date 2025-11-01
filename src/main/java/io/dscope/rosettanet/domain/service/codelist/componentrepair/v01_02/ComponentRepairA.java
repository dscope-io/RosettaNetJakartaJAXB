
package io.dscope.rosettanet.domain.service.codelist.componentrepair.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ComponentRepairA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ComponentRepair:xsd:codelist:01.02", "ComponentRepairA");

    public ComponentRepairA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ComponentRepairA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
