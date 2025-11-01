
package io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InventoryType
    extends JAXBElement<InventoryTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:1.0", "InventoryType");

    public InventoryType(InventoryTypeType value) {
        super(NAME, ((Class) InventoryTypeType.class), null, value);
    }

    public InventoryType() {
        super(NAME, ((Class) InventoryTypeType.class), null, null);
    }

}
