
package io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RouteLocation
    extends JAXBElement<RouteLocationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.02", "RouteLocation");

    public RouteLocation(RouteLocationType value) {
        super(NAME, ((Class) RouteLocationType.class), null, value);
    }

    public RouteLocation() {
        super(NAME, ((Class) RouteLocationType.class), null, null);
    }

}
