
package io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InventoryType
    extends JAXBElement<InventoryTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.02", "InventoryType");

    public InventoryType(InventoryTypeType value) {
        super(NAME, ((Class) InventoryTypeType.class), null, value);
    }

    public InventoryType() {
        super(NAME, ((Class) InventoryTypeType.class), null, null);
    }

}
