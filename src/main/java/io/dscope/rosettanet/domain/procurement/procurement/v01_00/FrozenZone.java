
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FrozenZone
    extends JAXBElement<FrozenZoneType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "FrozenZone");

    public FrozenZone(FrozenZoneType value) {
        super(NAME, ((Class) FrozenZoneType.class), null, value);
    }

    public FrozenZone() {
        super(NAME, ((Class) FrozenZoneType.class), null, null);
    }

}
