
package io.dscope.rosettanet.universal.partneridentification.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PartnerIdentification
    extends JAXBElement<PartnerIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.05", "PartnerIdentification");

    public PartnerIdentification(PartnerIdentificationType value) {
        super(NAME, ((Class) PartnerIdentificationType.class), null, value);
    }

    public PartnerIdentification() {
        super(NAME, ((Class) PartnerIdentificationType.class), null, null);
    }

}
