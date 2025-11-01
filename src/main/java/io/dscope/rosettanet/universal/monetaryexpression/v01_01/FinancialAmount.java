
package io.dscope.rosettanet.universal.monetaryexpression.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinancialAmount
    extends JAXBElement<FinancialAmountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.01", "FinancialAmount");

    public FinancialAmount(FinancialAmountType value) {
        super(NAME, ((Class) FinancialAmountType.class), null, value);
    }

    public FinancialAmount() {
        super(NAME, ((Class) FinancialAmountType.class), null, null);
    }

}
