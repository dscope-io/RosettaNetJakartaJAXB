
package io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DeviceType
    extends JAXBElement<DeviceTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:01.02", "DeviceType");

    public DeviceType(DeviceTypeType value) {
        super(NAME, ((Class) DeviceTypeType.class), null, value);
    }

    public DeviceType() {
        super(NAME, ((Class) DeviceTypeType.class), null, null);
    }

}
