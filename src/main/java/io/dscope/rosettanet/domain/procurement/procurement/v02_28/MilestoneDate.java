
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MilestoneDate
    extends JAXBElement<MilestoneDateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "MilestoneDate");

    public MilestoneDate(MilestoneDateType value) {
        super(NAME, ((Class) MilestoneDateType.class), null, value);
    }

    public MilestoneDate() {
        super(NAME, ((Class) MilestoneDateType.class), null, null);
    }

}
