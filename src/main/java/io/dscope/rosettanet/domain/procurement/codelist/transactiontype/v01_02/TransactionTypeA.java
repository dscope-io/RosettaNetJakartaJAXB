
package io.dscope.rosettanet.domain.procurement.codelist.transactiontype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransactionTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:01.02", "TransactionTypeA");

    public TransactionTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TransactionTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
