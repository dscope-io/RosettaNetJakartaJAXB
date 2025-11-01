
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipToPartnerLine
    extends JAXBElement<ShipToPartnerLineType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ShipToPartnerLine");

    public ShipToPartnerLine(ShipToPartnerLineType value) {
        super(NAME, ((Class) ShipToPartnerLineType.class), null, value);
    }

    public ShipToPartnerLine() {
        super(NAME, ((Class) ShipToPartnerLineType.class), null, null);
    }

}
