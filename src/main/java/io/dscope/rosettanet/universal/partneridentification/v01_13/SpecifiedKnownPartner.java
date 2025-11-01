
package io.dscope.rosettanet.universal.partneridentification.v01_13;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedKnownPartner
    extends JAXBElement<SpecifiedKnownPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.13", "SpecifiedKnownPartner");

    public SpecifiedKnownPartner(SpecifiedKnownPartnerType value) {
        super(NAME, ((Class) SpecifiedKnownPartnerType.class), null, value);
    }

    public SpecifiedKnownPartner() {
        super(NAME, ((Class) SpecifiedKnownPartnerType.class), null, null);
    }

}
