
package io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GovernmentPriorityRating
    extends JAXBElement<GovernmentPriorityRatingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", "GovernmentPriorityRating");

    public GovernmentPriorityRating(GovernmentPriorityRatingType value) {
        super(NAME, ((Class) GovernmentPriorityRatingType.class), null, value);
    }

    public GovernmentPriorityRating() {
        super(NAME, ((Class) GovernmentPriorityRatingType.class), null, null);
    }

}
