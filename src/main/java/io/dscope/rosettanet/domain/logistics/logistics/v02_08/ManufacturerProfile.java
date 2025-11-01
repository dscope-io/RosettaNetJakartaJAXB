
package io.dscope.rosettanet.domain.logistics.logistics.v02_08;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ManufacturerProfile
    extends JAXBElement<ManufacturerProfileType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08", "ManufacturerProfile");

    public ManufacturerProfile(ManufacturerProfileType value) {
        super(NAME, ((Class) ManufacturerProfileType.class), null, value);
    }

    public ManufacturerProfile() {
        super(NAME, ((Class) ManufacturerProfileType.class), null, null);
    }

}
