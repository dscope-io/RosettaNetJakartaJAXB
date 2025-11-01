
package io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GovernmentPriorityRatingA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", "GovernmentPriorityRatingA");

    public GovernmentPriorityRatingA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public GovernmentPriorityRatingA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
