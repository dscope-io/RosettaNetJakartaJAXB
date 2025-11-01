
package io.dscope.rosettanet.universal.partneridentification.v01_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class KnownPartner
    extends JAXBElement<KnownPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07", "KnownPartner");

    public KnownPartner(KnownPartnerType value) {
        super(NAME, ((Class) KnownPartnerType.class), null, value);
    }

    public KnownPartner() {
        super(NAME, ((Class) KnownPartnerType.class), null, null);
    }

}
