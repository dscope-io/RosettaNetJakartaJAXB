
package io.dscope.rosettanet.domain.marketing.codelist.projectmarketsegment.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProjectMarketSegment
    extends JAXBElement<ProjectMarketSegmentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02", "ProjectMarketSegment");

    public ProjectMarketSegment(ProjectMarketSegmentType value) {
        super(NAME, ((Class) ProjectMarketSegmentType.class), null, value);
    }

    public ProjectMarketSegment() {
        super(NAME, ((Class) ProjectMarketSegmentType.class), null, null);
    }

}
