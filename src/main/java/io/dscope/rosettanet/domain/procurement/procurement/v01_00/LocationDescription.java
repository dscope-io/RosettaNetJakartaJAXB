
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LocationDescription
    extends JAXBElement<LocationDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "LocationDescription");

    public LocationDescription(LocationDescriptionType value) {
        super(NAME, ((Class) LocationDescriptionType.class), null, value);
    }

    public LocationDescription() {
        super(NAME, ((Class) LocationDescriptionType.class), null, null);
    }

}
