
package io.dscope.rosettanet.domain.procurement.procurement.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MapReference
    extends JAXBElement<MapReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", "MapReference");

    public MapReference(MapReferenceType value) {
        super(NAME, ((Class) MapReferenceType.class), null, value);
    }

    public MapReference() {
        super(NAME, ((Class) MapReferenceType.class), null, null);
    }

}
