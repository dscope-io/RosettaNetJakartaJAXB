
package io.dscope.rosettanet.domain.service.codelist.componentrepair.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ComponentRepair
    extends JAXBElement<ComponentRepairType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ComponentRepair:xsd:codelist:01.02", "ComponentRepair");

    public ComponentRepair(ComponentRepairType value) {
        super(NAME, ((Class) ComponentRepairType.class), null, value);
    }

    public ComponentRepair() {
        super(NAME, ((Class) ComponentRepairType.class), null, null);
    }

}
