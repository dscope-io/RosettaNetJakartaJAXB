
package io.dscope.rosettanet.domain.logistics.codelist.containertype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContainerTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ContainerType:xsd:codelist:01.00", "ContainerTypeA");

    public ContainerTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ContainerTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
