
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderchangetype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseOrderChangeTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03", "PurchaseOrderChangeTypeA");

    public PurchaseOrderChangeTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseOrderChangeTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
