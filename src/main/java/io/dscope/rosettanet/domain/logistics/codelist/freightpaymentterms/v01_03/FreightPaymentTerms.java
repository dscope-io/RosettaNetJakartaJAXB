
package io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreightPaymentTerms
    extends JAXBElement<FreightPaymentTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03", "FreightPaymentTerms");

    public FreightPaymentTerms(FreightPaymentTermsType value) {
        super(NAME, ((Class) FreightPaymentTermsType.class), null, value);
    }

    public FreightPaymentTerms() {
        super(NAME, ((Class) FreightPaymentTermsType.class), null, null);
    }

}
