
package io.dscope.rosettanet.domain.procurement.codelist.financeterms.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FinanceTermsA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:1.0", "FinanceTermsA");

    public FinanceTermsA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FinanceTermsA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
