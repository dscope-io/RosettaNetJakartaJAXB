
package io.dscope.rosettanet.domain.procurement.codelist.transactiontype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransactionType
    extends JAXBElement<TransactionTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:01.03", "TransactionType");

    public TransactionType(TransactionTypeType value) {
        super(NAME, ((Class) TransactionTypeType.class), null, value);
    }

    public TransactionType() {
        super(NAME, ((Class) TransactionTypeType.class), null, null);
    }

}
