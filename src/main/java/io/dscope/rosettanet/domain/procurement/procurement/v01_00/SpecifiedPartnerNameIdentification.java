
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedPartnerNameIdentification
    extends JAXBElement<SpecifiedPartnerNameIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "SpecifiedPartnerNameIdentification");

    public SpecifiedPartnerNameIdentification(SpecifiedPartnerNameIdentificationType value) {
        super(NAME, ((Class) SpecifiedPartnerNameIdentificationType.class), null, value);
    }

    public SpecifiedPartnerNameIdentification() {
        super(NAME, ((Class) SpecifiedPartnerNameIdentificationType.class), null, null);
    }

}
