
package io.dscope.rosettanet.domain.design.design.v02_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ActualValue
    extends JAXBElement<ActualValueType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.22", "ActualValue");

    public ActualValue(ActualValueType value) {
        super(NAME, ((Class) ActualValueType.class), null, value);
    }

    public ActualValue() {
        super(NAME, ((Class) ActualValueType.class), null, null);
    }

}
