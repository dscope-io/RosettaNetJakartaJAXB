
package io.dscope.rosettanet.interchange.codelist.plan.v02_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PlanA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:Plan:xsd:codelist:02.00", "PlanA");

    public PlanA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PlanA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
