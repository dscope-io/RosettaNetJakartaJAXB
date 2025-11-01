
package io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreightPaymentTermsA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03", "FreightPaymentTermsA");

    public FreightPaymentTermsA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FreightPaymentTermsA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
