
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_26;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SourceDevice
    extends JAXBElement<SourceDeviceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26", "SourceDevice");

    public SourceDevice(SourceDeviceType value) {
        super(NAME, ((Class) SourceDeviceType.class), null, value);
    }

    public SourceDevice() {
        super(NAME, ((Class) SourceDeviceType.class), null, null);
    }

}
