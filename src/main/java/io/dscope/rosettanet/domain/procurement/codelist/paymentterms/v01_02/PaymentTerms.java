
package io.dscope.rosettanet.domain.procurement.codelist.paymentterms.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentTerms
    extends JAXBElement<PaymentTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PaymentTerms:xsd:codelist:01.02", "PaymentTerms");

    public PaymentTerms(PaymentTermsType value) {
        super(NAME, ((Class) PaymentTermsType.class), null, value);
    }

    public PaymentTerms() {
        super(NAME, ((Class) PaymentTermsType.class), null, null);
    }

}
