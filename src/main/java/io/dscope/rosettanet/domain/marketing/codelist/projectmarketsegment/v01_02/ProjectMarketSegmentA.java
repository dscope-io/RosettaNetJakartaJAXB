
package io.dscope.rosettanet.domain.marketing.codelist.projectmarketsegment.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProjectMarketSegmentA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02", "ProjectMarketSegmentA");

    public ProjectMarketSegmentA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProjectMarketSegmentA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
