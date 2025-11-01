
package io.dscope.rosettanet.interchange.codelist.plan.v02_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Plan
    extends JAXBElement<PlanType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:Plan:xsd:codelist:02.00", "Plan");

    public Plan(PlanType value) {
        super(NAME, ((Class) PlanType.class), null, value);
    }

    public Plan() {
        super(NAME, ((Class) PlanType.class), null, null);
    }

}
