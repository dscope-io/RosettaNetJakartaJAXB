
package io.dscope.rosettanet.domain.procurement.codelist.financialadjustmentreason.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinancialAdjustmentReason
    extends JAXBElement<FinancialAdjustmentReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:FinancialAdjustmentReason:xsd:codelist:1.0", "FinancialAdjustmentReason");

    public FinancialAdjustmentReason(FinancialAdjustmentReasonType value) {
        super(NAME, ((Class) FinancialAdjustmentReasonType.class), null, value);
    }

    public FinancialAdjustmentReason() {
        super(NAME, ((Class) FinancialAdjustmentReasonType.class), null, null);
    }

}
