
package io.dscope.rosettanet.domain.salesreporting.codelist.transactiontype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransactionTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:TransactionType:xsd:codelist:1.0", "TransactionTypeA");

    public TransactionTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TransactionTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
