
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SalesOutAndTransaction
    extends JAXBElement<SalesOutAndTransactionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", "SalesOutAndTransaction");

    public SalesOutAndTransaction(SalesOutAndTransactionType value) {
        super(NAME, ((Class) SalesOutAndTransactionType.class), null, value);
    }

    public SalesOutAndTransaction() {
        super(NAME, ((Class) SalesOutAndTransactionType.class), null, null);
    }

}
