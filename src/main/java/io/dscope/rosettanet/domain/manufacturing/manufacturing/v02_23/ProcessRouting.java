
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessRouting
    extends JAXBElement<ProcessRoutingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", "ProcessRouting");

    public ProcessRouting(ProcessRoutingType value) {
        super(NAME, ((Class) ProcessRoutingType.class), null, value);
    }

    public ProcessRouting() {
        super(NAME, ((Class) ProcessRoutingType.class), null, null);
    }

}
