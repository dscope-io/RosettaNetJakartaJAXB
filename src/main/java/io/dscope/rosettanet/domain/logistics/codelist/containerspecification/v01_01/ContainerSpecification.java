
package io.dscope.rosettanet.domain.logistics.codelist.containerspecification.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContainerSpecification
    extends JAXBElement<ContainerSpecificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.01", "ContainerSpecification");

    public ContainerSpecification(ContainerSpecificationType value) {
        super(NAME, ((Class) ContainerSpecificationType.class), null, value);
    }

    public ContainerSpecification() {
        super(NAME, ((Class) ContainerSpecificationType.class), null, null);
    }

}
