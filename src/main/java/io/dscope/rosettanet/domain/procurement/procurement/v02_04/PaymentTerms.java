
package io.dscope.rosettanet.domain.procurement.procurement.v02_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentTerms
    extends JAXBElement<PaymentTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04", "PaymentTerms");

    public PaymentTerms(PaymentTermsType value) {
        super(NAME, ((Class) PaymentTermsType.class), null, value);
    }

    public PaymentTerms() {
        super(NAME, ((Class) PaymentTermsType.class), null, null);
    }

}
