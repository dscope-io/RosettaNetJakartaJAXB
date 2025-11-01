
package io.dscope.rosettanet.domain.manufacturing.codelist.sortweight.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SortWeight
    extends JAXBElement<SortWeightType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.02", "SortWeight");

    public SortWeight(SortWeightType value) {
        super(NAME, ((Class) SortWeightType.class), null, value);
    }

    public SortWeight() {
        super(NAME, ((Class) SortWeightType.class), null, null);
    }

}
