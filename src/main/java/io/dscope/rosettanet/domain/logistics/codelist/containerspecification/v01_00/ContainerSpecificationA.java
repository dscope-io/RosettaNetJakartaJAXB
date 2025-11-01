
package io.dscope.rosettanet.domain.logistics.codelist.containerspecification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContainerSpecificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.00", "ContainerSpecificationA");

    public ContainerSpecificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ContainerSpecificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
