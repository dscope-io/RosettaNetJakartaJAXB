
package io.dscope.rosettanet.domain.procurement.codelist.accountclassification.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AccountClassification
    extends JAXBElement<AccountClassificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.02", "AccountClassification");

    public AccountClassification(AccountClassificationType value) {
        super(NAME, ((Class) AccountClassificationType.class), null, value);
    }

    public AccountClassification() {
        super(NAME, ((Class) AccountClassificationType.class), null, null);
    }

}
