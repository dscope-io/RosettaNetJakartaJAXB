
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OperationGate
    extends JAXBElement<OperationGateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", "OperationGate");

    public OperationGate(OperationGateType value) {
        super(NAME, ((Class) OperationGateType.class), null, value);
    }

    public OperationGate() {
        super(NAME, ((Class) OperationGateType.class), null, null);
    }

}
