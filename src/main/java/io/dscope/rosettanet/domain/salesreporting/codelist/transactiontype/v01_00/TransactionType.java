
package io.dscope.rosettanet.domain.salesreporting.codelist.transactiontype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransactionType
    extends JAXBElement<TransactionTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:TransactionType:xsd:codelist:1.0", "TransactionType");

    public TransactionType(TransactionTypeType value) {
        super(NAME, ((Class) TransactionTypeType.class), null, value);
    }

    public TransactionType() {
        super(NAME, ((Class) TransactionTypeType.class), null, null);
    }

}
