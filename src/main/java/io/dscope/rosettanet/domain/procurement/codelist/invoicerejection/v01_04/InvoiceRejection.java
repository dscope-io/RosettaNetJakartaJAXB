
package io.dscope.rosettanet.domain.procurement.codelist.invoicerejection.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InvoiceRejection
    extends JAXBElement<InvoiceRejectionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.04", "InvoiceRejection");

    public InvoiceRejection(InvoiceRejectionType value) {
        super(NAME, ((Class) InvoiceRejectionType.class), null, value);
    }

    public InvoiceRejection() {
        super(NAME, ((Class) InvoiceRejectionType.class), null, null);
    }

}
