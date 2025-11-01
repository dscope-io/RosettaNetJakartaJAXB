
package io.dscope.rosettanet.domain.design.design.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Radioactivity
    extends JAXBElement<RadioactivityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.17", "Radioactivity");

    public Radioactivity(RadioactivityType value) {
        super(NAME, ((Class) RadioactivityType.class), null, value);
    }

    public Radioactivity() {
        super(NAME, ((Class) RadioactivityType.class), null, null);
    }

}
