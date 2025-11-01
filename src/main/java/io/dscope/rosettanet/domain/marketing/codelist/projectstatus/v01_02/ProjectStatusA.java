
package io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProjectStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", "ProjectStatusA");

    public ProjectStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProjectStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
