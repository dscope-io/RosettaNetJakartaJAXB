
package io.dscope.rosettanet.domain.manufacturing.codelist.devicepackagetype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DevicePackageType
    extends JAXBElement<DevicePackageTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:1.0", "DevicePackageType");

    public DevicePackageType(DevicePackageTypeType value) {
        super(NAME, ((Class) DevicePackageTypeType.class), null, value);
    }

    public DevicePackageType() {
        super(NAME, ((Class) DevicePackageTypeType.class), null, null);
    }

}
