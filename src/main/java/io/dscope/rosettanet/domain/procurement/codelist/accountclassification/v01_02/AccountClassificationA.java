
package io.dscope.rosettanet.domain.procurement.codelist.accountclassification.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AccountClassificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.02", "AccountClassificationA");

    public AccountClassificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public AccountClassificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
