
package io.dscope.rosettanet.universal.partneridentification.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedPartnerDescription
    extends JAXBElement<SpecifiedPartnerDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.05", "SpecifiedPartnerDescription");

    public SpecifiedPartnerDescription(SpecifiedPartnerDescriptionType value) {
        super(NAME, ((Class) SpecifiedPartnerDescriptionType.class), null, value);
    }

    public SpecifiedPartnerDescription() {
        super(NAME, ((Class) SpecifiedPartnerDescriptionType.class), null, null);
    }

}
