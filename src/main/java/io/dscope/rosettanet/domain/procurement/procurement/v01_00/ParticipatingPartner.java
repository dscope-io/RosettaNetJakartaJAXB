
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ParticipatingPartner
    extends JAXBElement<ParticipatingPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ParticipatingPartner");

    public ParticipatingPartner(ParticipatingPartnerType value) {
        super(NAME, ((Class) ParticipatingPartnerType.class), null, value);
    }

    public ParticipatingPartner() {
        super(NAME, ((Class) ParticipatingPartnerType.class), null, null);
    }

}
