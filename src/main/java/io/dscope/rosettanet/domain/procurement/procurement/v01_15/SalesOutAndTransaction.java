
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SalesOutAndTransaction
    extends JAXBElement<SalesOutAndTransactionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", "SalesOutAndTransaction");

    public SalesOutAndTransaction(SalesOutAndTransactionType value) {
        super(NAME, ((Class) SalesOutAndTransactionType.class), null, value);
    }

    public SalesOutAndTransaction() {
        super(NAME, ((Class) SalesOutAndTransactionType.class), null, null);
    }

}
