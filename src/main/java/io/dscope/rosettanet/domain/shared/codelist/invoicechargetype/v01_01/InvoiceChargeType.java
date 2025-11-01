
package io.dscope.rosettanet.domain.shared.codelist.invoicechargetype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InvoiceChargeType
    extends JAXBElement<InvoiceChargeTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.01", "InvoiceChargeType");

    public InvoiceChargeType(InvoiceChargeTypeType value) {
        super(NAME, ((Class) InvoiceChargeTypeType.class), null, value);
    }

    public InvoiceChargeType() {
        super(NAME, ((Class) InvoiceChargeTypeType.class), null, null);
    }

}
