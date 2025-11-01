
package io.dscope.rosettanet.domain.design.design.v02_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessValue
    extends JAXBElement<ProcessValueType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.07", "ProcessValue");

    public ProcessValue(ProcessValueType value) {
        super(NAME, ((Class) ProcessValueType.class), null, value);
    }

    public ProcessValue() {
        super(NAME, ((Class) ProcessValueType.class), null, null);
    }

}
