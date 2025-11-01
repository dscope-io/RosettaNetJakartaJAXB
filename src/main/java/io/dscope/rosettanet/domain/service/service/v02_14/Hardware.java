
package io.dscope.rosettanet.domain.service.service.v02_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Hardware
    extends JAXBElement<HardwareType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.14", "Hardware");

    public Hardware(HardwareType value) {
        super(NAME, ((Class) HardwareType.class), null, value);
    }

    public Hardware() {
        super(NAME, ((Class) HardwareType.class), null, null);
    }

}
