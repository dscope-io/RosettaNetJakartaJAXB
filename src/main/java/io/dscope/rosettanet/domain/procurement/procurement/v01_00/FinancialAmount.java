
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinancialAmount
    extends JAXBElement<FinancialAmountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "FinancialAmount");

    public FinancialAmount(FinancialAmountType value) {
        super(NAME, ((Class) FinancialAmountType.class), null, value);
    }

    public FinancialAmount() {
        super(NAME, ((Class) FinancialAmountType.class), null, null);
    }

}
