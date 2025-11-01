
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SoldToPartner
    extends JAXBElement<SoldToPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "SoldToPartner");

    public SoldToPartner(SoldToPartnerType value) {
        super(NAME, ((Class) SoldToPartnerType.class), null, value);
    }

    public SoldToPartner() {
        super(NAME, ((Class) SoldToPartnerType.class), null, null);
    }

}
