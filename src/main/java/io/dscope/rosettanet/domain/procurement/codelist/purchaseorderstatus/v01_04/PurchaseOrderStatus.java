
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderStatus
    extends JAXBElement<PurchaseOrderStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.04", "PurchaseOrderStatus");

    public PurchaseOrderStatus(PurchaseOrderStatusType value) {
        super(NAME, ((Class) PurchaseOrderStatusType.class), null, value);
    }

    public PurchaseOrderStatus() {
        super(NAME, ((Class) PurchaseOrderStatusType.class), null, null);
    }

}
