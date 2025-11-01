
package io.dscope.rosettanet.universal.locations.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Location
    extends JAXBElement<LocationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Locations:xsd:schema:01.03", "Location");

    public Location(LocationType value) {
        super(NAME, ((Class) LocationType.class), null, value);
    }

    public Location() {
        super(NAME, ((Class) LocationType.class), null, null);
    }

}
