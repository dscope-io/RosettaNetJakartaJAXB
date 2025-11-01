
package io.dscope.rosettanet.domain.manufacturing.codelist.componenttype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ComponentTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ComponentType:xsd:codelist:01.00", "ComponentTypeA");

    public ComponentTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ComponentTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
