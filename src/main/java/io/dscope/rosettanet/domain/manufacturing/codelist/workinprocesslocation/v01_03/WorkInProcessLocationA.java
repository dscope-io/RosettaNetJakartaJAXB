
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesslocation.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WorkInProcessLocationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03", "WorkInProcessLocationA");

    public WorkInProcessLocationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WorkInProcessLocationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
