
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransportedByPartner
    extends JAXBElement<TransportedByPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "TransportedByPartner");

    public TransportedByPartner(TransportedByPartnerType value) {
        super(NAME, ((Class) TransportedByPartnerType.class), null, value);
    }

    public TransportedByPartner() {
        super(NAME, ((Class) TransportedByPartnerType.class), null, null);
    }

}
