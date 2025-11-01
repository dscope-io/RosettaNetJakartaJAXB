
package io.dscope.rosettanet.domain.procurement.codelist.carriercode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CarrierCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CarrierCode:xsd:codelist:1.0", "CarrierCodeA");

    public CarrierCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CarrierCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
