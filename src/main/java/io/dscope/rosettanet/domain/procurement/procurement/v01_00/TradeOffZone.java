
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TradeOffZone
    extends JAXBElement<TradeOffZoneType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "TradeOffZone");

    public TradeOffZone(TradeOffZoneType value) {
        super(NAME, ((Class) TradeOffZoneType.class), null, value);
    }

    public TradeOffZone() {
        super(NAME, ((Class) TradeOffZoneType.class), null, null);
    }

}
