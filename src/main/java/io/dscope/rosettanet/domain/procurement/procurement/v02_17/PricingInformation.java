
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PricingInformation
    extends JAXBElement<PricingInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", "PricingInformation");

    public PricingInformation(PricingInformationType value) {
        super(NAME, ((Class) PricingInformationType.class), null, value);
    }

    public PricingInformation() {
        super(NAME, ((Class) PricingInformationType.class), null, null);
    }

}
