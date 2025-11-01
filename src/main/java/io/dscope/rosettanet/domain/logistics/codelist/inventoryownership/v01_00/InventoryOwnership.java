
package io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InventoryOwnership
    extends JAXBElement<InventoryOwnershipType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.00", "InventoryOwnership");

    public InventoryOwnership(InventoryOwnershipType value) {
        super(NAME, ((Class) InventoryOwnershipType.class), null, value);
    }

    public InventoryOwnership() {
        super(NAME, ((Class) InventoryOwnershipType.class), null, null);
    }

}
