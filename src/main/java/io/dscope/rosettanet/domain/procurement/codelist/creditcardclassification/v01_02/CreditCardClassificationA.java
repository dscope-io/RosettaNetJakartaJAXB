
package io.dscope.rosettanet.domain.procurement.codelist.creditcardclassification.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CreditCardClassificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:01.02", "CreditCardClassificationA");

    public CreditCardClassificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CreditCardClassificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
