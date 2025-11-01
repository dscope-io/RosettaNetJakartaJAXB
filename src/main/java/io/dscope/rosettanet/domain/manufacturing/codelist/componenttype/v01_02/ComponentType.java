
package io.dscope.rosettanet.domain.manufacturing.codelist.componenttype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ComponentType
    extends JAXBElement<ComponentTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ComponentType:xsd:codelist:01.02", "ComponentType");

    public ComponentType(ComponentTypeType value) {
        super(NAME, ((Class) ComponentTypeType.class), null, value);
    }

    public ComponentType() {
        super(NAME, ((Class) ComponentTypeType.class), null, null);
    }

}
