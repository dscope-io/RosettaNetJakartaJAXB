
package io.dscope.rosettanet.domain.procurement.codelist.invoicechargetype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InvoiceChargeType
    extends JAXBElement<InvoiceChargeTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:InvoiceChargeType:xsd:codelist:1.0", "InvoiceChargeType");

    public InvoiceChargeType(InvoiceChargeTypeType value) {
        super(NAME, ((Class) InvoiceChargeTypeType.class), null, value);
    }

    public InvoiceChargeType() {
        super(NAME, ((Class) InvoiceChargeTypeType.class), null, null);
    }

}
