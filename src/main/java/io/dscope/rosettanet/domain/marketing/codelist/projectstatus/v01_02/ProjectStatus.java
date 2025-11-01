
package io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProjectStatus
    extends JAXBElement<ProjectStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", "ProjectStatus");

    public ProjectStatus(ProjectStatusType value) {
        super(NAME, ((Class) ProjectStatusType.class), null, value);
    }

    public ProjectStatus() {
        super(NAME, ((Class) ProjectStatusType.class), null, null);
    }

}
