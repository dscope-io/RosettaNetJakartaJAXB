
package io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.03", "PurchaseOrderTypeA");

    public PurchaseOrderTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseOrderTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
