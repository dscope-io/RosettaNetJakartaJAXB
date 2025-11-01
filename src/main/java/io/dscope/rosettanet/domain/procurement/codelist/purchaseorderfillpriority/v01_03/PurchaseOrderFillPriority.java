
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderFillPriority
    extends JAXBElement<PurchaseOrderFillPriorityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", "PurchaseOrderFillPriority");

    public PurchaseOrderFillPriority(PurchaseOrderFillPriorityType value) {
        super(NAME, ((Class) PurchaseOrderFillPriorityType.class), null, value);
    }

    public PurchaseOrderFillPriority() {
        super(NAME, ((Class) PurchaseOrderFillPriorityType.class), null, null);
    }

}
