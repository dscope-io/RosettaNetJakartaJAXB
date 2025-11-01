
package io.dscope.rosettanet.universal.partneridentification.v01_09;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedFullPartner
    extends JAXBElement<SpecifiedFullPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.09", "SpecifiedFullPartner");

    public SpecifiedFullPartner(SpecifiedFullPartnerType value) {
        super(NAME, ((Class) SpecifiedFullPartnerType.class), null, value);
    }

    public SpecifiedFullPartner() {
        super(NAME, ((Class) SpecifiedFullPartnerType.class), null, null);
    }

}
