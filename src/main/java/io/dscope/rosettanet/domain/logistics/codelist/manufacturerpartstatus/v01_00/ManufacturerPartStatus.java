
package io.dscope.rosettanet.domain.logistics.codelist.manufacturerpartstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ManufacturerPartStatus
    extends JAXBElement<ManufacturerPartStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ManufacturerPartStatus:xsd:codelist:1.0", "ManufacturerPartStatus");

    public ManufacturerPartStatus(ManufacturerPartStatusType value) {
        super(NAME, ((Class) ManufacturerPartStatusType.class), null, value);
    }

    public ManufacturerPartStatus() {
        super(NAME, ((Class) ManufacturerPartStatusType.class), null, null);
    }

}
