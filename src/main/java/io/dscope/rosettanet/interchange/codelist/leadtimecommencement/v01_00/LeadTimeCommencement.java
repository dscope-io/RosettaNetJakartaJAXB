
package io.dscope.rosettanet.interchange.codelist.leadtimecommencement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LeadTimeCommencement
    extends JAXBElement<LeadTimeCommencementType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.00", "LeadTimeCommencement");

    public LeadTimeCommencement(LeadTimeCommencementType value) {
        super(NAME, ((Class) LeadTimeCommencementType.class), null, value);
    }

    public LeadTimeCommencement() {
        super(NAME, ((Class) LeadTimeCommencementType.class), null, null);
    }

}
