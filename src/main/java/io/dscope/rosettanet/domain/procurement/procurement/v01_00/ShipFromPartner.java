
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipFromPartner
    extends JAXBElement<ShipFromPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ShipFromPartner");

    public ShipFromPartner(ShipFromPartnerType value) {
        super(NAME, ((Class) ShipFromPartnerType.class), null, value);
    }

    public ShipFromPartner() {
        super(NAME, ((Class) ShipFromPartnerType.class), null, null);
    }

}
