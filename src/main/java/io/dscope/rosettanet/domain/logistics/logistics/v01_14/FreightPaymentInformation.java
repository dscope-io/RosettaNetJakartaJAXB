
package io.dscope.rosettanet.domain.logistics.logistics.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreightPaymentInformation
    extends JAXBElement<FreightPaymentInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.14", "FreightPaymentInformation");

    public FreightPaymentInformation(FreightPaymentInformationType value) {
        super(NAME, ((Class) FreightPaymentInformationType.class), null, value);
    }

    public FreightPaymentInformation() {
        super(NAME, ((Class) FreightPaymentInformationType.class), null, null);
    }

}
