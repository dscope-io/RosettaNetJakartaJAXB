
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PartnerDescriptionTax
    extends JAXBElement<PartnerDescriptionTaxType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "PartnerDescriptionTax");

    public PartnerDescriptionTax(PartnerDescriptionTaxType value) {
        super(NAME, ((Class) PartnerDescriptionTaxType.class), null, value);
    }

    public PartnerDescriptionTax() {
        super(NAME, ((Class) PartnerDescriptionTaxType.class), null, null);
    }

}
