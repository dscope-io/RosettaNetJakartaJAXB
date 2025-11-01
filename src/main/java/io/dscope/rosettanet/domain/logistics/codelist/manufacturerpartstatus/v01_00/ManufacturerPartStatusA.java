
package io.dscope.rosettanet.domain.logistics.codelist.manufacturerpartstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ManufacturerPartStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ManufacturerPartStatus:xsd:codelist:1.0", "ManufacturerPartStatusA");

    public ManufacturerPartStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ManufacturerPartStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
