
package io.dscope.rosettanet.domain.design.design.v02_23;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Threshold
    extends JAXBElement<ThresholdType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.23", "Threshold");

    public Threshold(ThresholdType value) {
        super(NAME, ((Class) ThresholdType.class), null, value);
    }

    public Threshold() {
        super(NAME, ((Class) ThresholdType.class), null, null);
    }

}
