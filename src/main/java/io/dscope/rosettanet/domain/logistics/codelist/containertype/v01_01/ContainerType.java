
package io.dscope.rosettanet.domain.logistics.codelist.containertype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContainerType
    extends JAXBElement<ContainerTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ContainerType:xsd:codelist:01.01", "ContainerType");

    public ContainerType(ContainerTypeType value) {
        super(NAME, ((Class) ContainerTypeType.class), null, value);
    }

    public ContainerType() {
        super(NAME, ((Class) ContainerTypeType.class), null, null);
    }

}
