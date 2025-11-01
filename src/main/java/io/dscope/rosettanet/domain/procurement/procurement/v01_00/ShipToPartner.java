
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipToPartner
    extends JAXBElement<ShipToPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ShipToPartner");

    public ShipToPartner(ShipToPartnerType value) {
        super(NAME, ((Class) ShipToPartnerType.class), null, value);
    }

    public ShipToPartner() {
        super(NAME, ((Class) ShipToPartnerType.class), null, null);
    }

}
