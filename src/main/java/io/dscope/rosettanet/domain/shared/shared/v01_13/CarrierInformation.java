
package io.dscope.rosettanet.domain.shared.shared.v01_13;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CarrierInformation
    extends JAXBElement<CarrierInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.13", "CarrierInformation");

    public CarrierInformation(CarrierInformationType value) {
        super(NAME, ((Class) CarrierInformationType.class), null, value);
    }

    public CarrierInformation() {
        super(NAME, ((Class) CarrierInformationType.class), null, null);
    }

}
