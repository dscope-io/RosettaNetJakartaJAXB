
package io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InventoryOwnershipA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.01", "InventoryOwnershipA");

    public InventoryOwnershipA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public InventoryOwnershipA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
