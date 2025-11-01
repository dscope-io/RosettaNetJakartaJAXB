
package io.dscope.rosettanet.domain.procurement.codelist.carriercode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CarrierCode
    extends JAXBElement<CarrierCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CarrierCode:xsd:codelist:1.0", "CarrierCode");

    public CarrierCode(CarrierCodeType value) {
        super(NAME, ((Class) CarrierCodeType.class), null, value);
    }

    public CarrierCode() {
        super(NAME, ((Class) CarrierCodeType.class), null, null);
    }

}
