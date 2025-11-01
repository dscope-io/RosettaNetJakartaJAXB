
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DeviceProductRegistration
    extends JAXBElement<DeviceProductRegistrationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "DeviceProductRegistration");

    public DeviceProductRegistration(DeviceProductRegistrationType value) {
        super(NAME, ((Class) DeviceProductRegistrationType.class), null, value);
    }

    public DeviceProductRegistration() {
        super(NAME, ((Class) DeviceProductRegistrationType.class), null, null);
    }

}
