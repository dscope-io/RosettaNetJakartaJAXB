
package io.dscope.rosettanet.domain.marketing.codelist.geographicregioncode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GeographicRegionCode
    extends JAXBElement<GeographicRegionCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:GeographicRegionCode:xsd:codelist:01.02", "GeographicRegionCode");

    public GeographicRegionCode(GeographicRegionCodeType value) {
        super(NAME, ((Class) GeographicRegionCodeType.class), null, value);
    }

    public GeographicRegionCode() {
        super(NAME, ((Class) GeographicRegionCodeType.class), null, null);
    }

}
