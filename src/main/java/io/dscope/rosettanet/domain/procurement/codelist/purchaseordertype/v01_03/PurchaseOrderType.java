
package io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderType
    extends JAXBElement<PurchaseOrderTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.03", "PurchaseOrderType");

    public PurchaseOrderType(PurchaseOrderTypeType value) {
        super(NAME, ((Class) PurchaseOrderTypeType.class), null, value);
    }

    public PurchaseOrderType() {
        super(NAME, ((Class) PurchaseOrderTypeType.class), null, null);
    }

}
