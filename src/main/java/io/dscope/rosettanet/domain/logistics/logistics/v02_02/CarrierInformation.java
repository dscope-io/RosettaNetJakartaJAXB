
package io.dscope.rosettanet.domain.logistics.logistics.v02_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CarrierInformation
    extends JAXBElement<CarrierInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02", "CarrierInformation");

    public CarrierInformation(CarrierInformationType value) {
        super(NAME, ((Class) CarrierInformationType.class), null, value);
    }

    public CarrierInformation() {
        super(NAME, ((Class) CarrierInformationType.class), null, null);
    }

}
