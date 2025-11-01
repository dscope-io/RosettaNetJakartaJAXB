
package io.dscope.rosettanet.domain.procurement.procurement.v01_21;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InvoiceAmount
    extends JAXBElement<InvoiceAmountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.21", "InvoiceAmount");

    public InvoiceAmount(InvoiceAmountType value) {
        super(NAME, ((Class) InvoiceAmountType.class), null, value);
    }

    public InvoiceAmount() {
        super(NAME, ((Class) InvoiceAmountType.class), null, null);
    }

}
