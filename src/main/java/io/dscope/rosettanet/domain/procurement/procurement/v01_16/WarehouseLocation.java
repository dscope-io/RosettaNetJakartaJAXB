
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarehouseLocation
    extends JAXBElement<WarehouseLocationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16", "WarehouseLocation");

    public WarehouseLocation(WarehouseLocationType value) {
        super(NAME, ((Class) WarehouseLocationType.class), null, value);
    }

    public WarehouseLocation() {
        super(NAME, ((Class) WarehouseLocationType.class), null, null);
    }

}
