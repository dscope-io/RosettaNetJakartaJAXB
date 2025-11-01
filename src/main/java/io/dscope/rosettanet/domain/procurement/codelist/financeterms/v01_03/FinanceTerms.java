
package io.dscope.rosettanet.domain.procurement.codelist.financeterms.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinanceTerms
    extends JAXBElement<FinanceTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:01.03", "FinanceTerms");

    public FinanceTerms(FinanceTermsType value) {
        super(NAME, ((Class) FinanceTermsType.class), null, value);
    }

    public FinanceTerms() {
        super(NAME, ((Class) FinanceTermsType.class), null, null);
    }

}
