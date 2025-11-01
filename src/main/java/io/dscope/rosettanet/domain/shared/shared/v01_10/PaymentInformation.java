
package io.dscope.rosettanet.domain.shared.shared.v01_10;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PaymentInformation
    extends JAXBElement<PaymentInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", "PaymentInformation");

    public PaymentInformation(PaymentInformationType value) {
        super(NAME, ((Class) PaymentInformationType.class), null, value);
    }

    public PaymentInformation() {
        super(NAME, ((Class) PaymentInformationType.class), null, null);
    }

}
