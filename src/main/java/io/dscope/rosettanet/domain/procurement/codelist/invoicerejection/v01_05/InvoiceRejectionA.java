
package io.dscope.rosettanet.domain.procurement.codelist.invoicerejection.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InvoiceRejectionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.05", "InvoiceRejectionA");

    public InvoiceRejectionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public InvoiceRejectionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
