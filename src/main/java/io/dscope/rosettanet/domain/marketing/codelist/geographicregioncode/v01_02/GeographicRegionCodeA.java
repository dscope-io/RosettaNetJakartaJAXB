
package io.dscope.rosettanet.domain.marketing.codelist.geographicregioncode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GeographicRegionCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:GeographicRegionCode:xsd:codelist:01.02", "GeographicRegionCodeA");

    public GeographicRegionCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public GeographicRegionCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
