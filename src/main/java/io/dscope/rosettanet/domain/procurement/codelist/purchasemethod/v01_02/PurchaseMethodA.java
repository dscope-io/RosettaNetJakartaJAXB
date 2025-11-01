
package io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseMethodA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.02", "PurchaseMethodA");

    public PurchaseMethodA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PurchaseMethodA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
