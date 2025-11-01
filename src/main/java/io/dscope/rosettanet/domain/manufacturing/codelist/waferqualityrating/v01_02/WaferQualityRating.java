
package io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferQualityRating
    extends JAXBElement<WaferQualityRatingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WaferQualityRating:xsd:codelist:01.02", "WaferQualityRating");

    public WaferQualityRating(WaferQualityRatingType value) {
        super(NAME, ((Class) WaferQualityRatingType.class), null, value);
    }

    public WaferQualityRating() {
        super(NAME, ((Class) WaferQualityRatingType.class), null, null);
    }

}
