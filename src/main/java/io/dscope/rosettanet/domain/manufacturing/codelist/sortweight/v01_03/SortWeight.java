
package io.dscope.rosettanet.domain.manufacturing.codelist.sortweight.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SortWeight
    extends JAXBElement<SortWeightType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.03", "SortWeight");

    public SortWeight(SortWeightType value) {
        super(NAME, ((Class) SortWeightType.class), null, value);
    }

    public SortWeight() {
        super(NAME, ((Class) SortWeightType.class), null, null);
    }

}
