
package io.dscope.rosettanet.domain.manufacturing.codelist.devicepackagetype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DevicePackageTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:01.02", "DevicePackageTypeA");

    public DevicePackageTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DevicePackageTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
