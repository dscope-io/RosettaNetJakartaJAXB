
package io.dscope.rosettanet.universal.partneridentification.v01_16;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedIntermittentPartner
    extends JAXBElement<SpecifiedIntermittentPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", "SpecifiedIntermittentPartner");

    public SpecifiedIntermittentPartner(SpecifiedIntermittentPartnerType value) {
        super(NAME, ((Class) SpecifiedIntermittentPartnerType.class), null, value);
    }

    public SpecifiedIntermittentPartner() {
        super(NAME, ((Class) SpecifiedIntermittentPartnerType.class), null, null);
    }

}
