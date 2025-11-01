
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Fault
    extends JAXBElement<FaultType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "Fault");

    public Fault(FaultType value) {
        super(NAME, ((Class) FaultType.class), null, value);
    }

    public Fault() {
        super(NAME, ((Class) FaultType.class), null, null);
    }

}
