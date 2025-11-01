
package io.dscope.rosettanet.domain.procurement.codelist.paymentterms.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentTermsA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PaymentTerms:xsd:codelist:01.03", "PaymentTermsA");

    public PaymentTermsA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PaymentTermsA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
