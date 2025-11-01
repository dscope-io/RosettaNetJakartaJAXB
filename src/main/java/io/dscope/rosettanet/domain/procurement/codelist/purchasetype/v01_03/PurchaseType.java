
package io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PurchaseType
    extends JAXBElement<PurchaseTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.03", "PurchaseType");

    public PurchaseType(PurchaseTypeType value) {
        super(NAME, ((Class) PurchaseTypeType.class), null, value);
    }

    public PurchaseType() {
        super(NAME, ((Class) PurchaseTypeType.class), null, null);
    }

}
