
package io.dscope.rosettanet.domain.procurement.codelist.invoicechargetype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InvoiceChargeTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:InvoiceChargeType:xsd:codelist:1.0", "InvoiceChargeTypeA");

    public InvoiceChargeTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public InvoiceChargeTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
