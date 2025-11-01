
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GeographicRegion
    extends JAXBElement<GeographicRegionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "GeographicRegion");

    public GeographicRegion(GeographicRegionType value) {
        super(NAME, ((Class) GeographicRegionType.class), null, value);
    }

    public GeographicRegion() {
        super(NAME, ((Class) GeographicRegionType.class), null, null);
    }

}
