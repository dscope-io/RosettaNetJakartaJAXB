
package io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InventoryTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03", "InventoryTypeA");

    public InventoryTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public InventoryTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
