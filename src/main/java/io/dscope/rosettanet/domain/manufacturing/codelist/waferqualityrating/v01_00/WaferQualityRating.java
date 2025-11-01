
package io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferQualityRating
    extends JAXBElement<WaferQualityRatingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WaferQualityRating:xsd:codelist:1.0", "WaferQualityRating");

    public WaferQualityRating(WaferQualityRatingType value) {
        super(NAME, ((Class) WaferQualityRatingType.class), null, value);
    }

    public WaferQualityRating() {
        super(NAME, ((Class) WaferQualityRatingType.class), null, null);
    }

}
