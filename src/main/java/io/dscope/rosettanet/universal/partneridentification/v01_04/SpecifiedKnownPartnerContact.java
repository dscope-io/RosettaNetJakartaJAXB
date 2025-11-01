
package io.dscope.rosettanet.universal.partneridentification.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedKnownPartnerContact
    extends JAXBElement<SpecifiedKnownPartnerContactType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04", "SpecifiedKnownPartnerContact");

    public SpecifiedKnownPartnerContact(SpecifiedKnownPartnerContactType value) {
        super(NAME, ((Class) SpecifiedKnownPartnerContactType.class), null, value);
    }

    public SpecifiedKnownPartnerContact() {
        super(NAME, ((Class) SpecifiedKnownPartnerContactType.class), null, null);
    }

}
