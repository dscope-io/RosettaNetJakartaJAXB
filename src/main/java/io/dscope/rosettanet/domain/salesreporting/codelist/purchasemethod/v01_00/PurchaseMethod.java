
package io.dscope.rosettanet.domain.salesreporting.codelist.purchasemethod.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseMethod
    extends JAXBElement<PurchaseMethodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:PurchaseMethod:xsd:codelist:1.0", "PurchaseMethod");

    public PurchaseMethod(PurchaseMethodType value) {
        super(NAME, ((Class) PurchaseMethodType.class), null, value);
    }

    public PurchaseMethod() {
        super(NAME, ((Class) PurchaseMethodType.class), null, null);
    }

}
