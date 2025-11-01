
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InventoryItemIdentification
    extends JAXBElement<InventoryItemIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", "InventoryItemIdentification");

    public InventoryItemIdentification(InventoryItemIdentificationType value) {
        super(NAME, ((Class) InventoryItemIdentificationType.class), null, value);
    }

    public InventoryItemIdentification() {
        super(NAME, ((Class) InventoryItemIdentificationType.class), null, null);
    }

}
