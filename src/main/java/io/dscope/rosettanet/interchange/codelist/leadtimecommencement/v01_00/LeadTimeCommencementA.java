
package io.dscope.rosettanet.interchange.codelist.leadtimecommencement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LeadTimeCommencementA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.00", "LeadTimeCommencementA");

    public LeadTimeCommencementA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LeadTimeCommencementA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
