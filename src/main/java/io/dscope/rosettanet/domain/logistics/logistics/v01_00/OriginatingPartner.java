
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OriginatingPartner
    extends JAXBElement<OriginatingPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "OriginatingPartner");

    public OriginatingPartner(OriginatingPartnerType value) {
        super(NAME, ((Class) OriginatingPartnerType.class), null, value);
    }

    public OriginatingPartner() {
        super(NAME, ((Class) OriginatingPartnerType.class), null, null);
    }

}
