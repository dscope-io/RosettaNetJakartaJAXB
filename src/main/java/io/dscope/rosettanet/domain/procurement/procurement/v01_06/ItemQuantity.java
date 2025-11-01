
package io.dscope.rosettanet.domain.procurement.procurement.v01_06;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ItemQuantity
    extends JAXBElement<ItemQuantityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06", "ItemQuantity");

    public ItemQuantity(ItemQuantityType value) {
        super(NAME, ((Class) ItemQuantityType.class), null, value);
    }

    public ItemQuantity() {
        super(NAME, ((Class) ItemQuantityType.class), null, null);
    }

}
