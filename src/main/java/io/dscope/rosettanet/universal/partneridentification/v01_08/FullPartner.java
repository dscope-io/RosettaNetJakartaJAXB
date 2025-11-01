
package io.dscope.rosettanet.universal.partneridentification.v01_08;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FullPartner
    extends JAXBElement<FullPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08", "FullPartner");

    public FullPartner(FullPartnerType value) {
        super(NAME, ((Class) FullPartnerType.class), null, value);
    }

    public FullPartner() {
        super(NAME, ((Class) FullPartnerType.class), null, null);
    }

}
