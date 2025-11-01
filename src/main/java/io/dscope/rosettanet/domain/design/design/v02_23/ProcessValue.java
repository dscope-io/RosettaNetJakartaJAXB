
package io.dscope.rosettanet.domain.design.design.v02_23;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessValue
    extends JAXBElement<ProcessValueType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.23", "ProcessValue");

    public ProcessValue(ProcessValueType value) {
        super(NAME, ((Class) ProcessValueType.class), null, value);
    }

    public ProcessValue() {
        super(NAME, ((Class) ProcessValueType.class), null, null);
    }

}
