
package io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferQualityRatingA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WaferQualityRating:xsd:codelist:01.03", "WaferQualityRatingA");

    public WaferQualityRatingA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WaferQualityRatingA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
