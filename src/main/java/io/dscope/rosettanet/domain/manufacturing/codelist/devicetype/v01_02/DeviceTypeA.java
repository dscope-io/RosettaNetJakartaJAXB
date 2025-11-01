
package io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DeviceTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:01.02", "DeviceTypeA");

    public DeviceTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DeviceTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
