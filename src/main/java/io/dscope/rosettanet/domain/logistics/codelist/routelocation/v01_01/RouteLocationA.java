
package io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RouteLocationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.01", "RouteLocationA");

    public RouteLocationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RouteLocationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
