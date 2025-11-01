
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipToPartnerSubLine
    extends JAXBElement<ShipToPartnerSubLineType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ShipToPartnerSubLine");

    public ShipToPartnerSubLine(ShipToPartnerSubLineType value) {
        super(NAME, ((Class) ShipToPartnerSubLineType.class), null, value);
    }

    public ShipToPartnerSubLine() {
        super(NAME, ((Class) ShipToPartnerSubLineType.class), null, null);
    }

}
