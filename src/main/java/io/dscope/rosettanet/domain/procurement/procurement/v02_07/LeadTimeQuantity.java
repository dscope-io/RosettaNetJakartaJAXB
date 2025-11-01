
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LeadTimeQuantity
    extends JAXBElement<LeadTimeQuantityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", "LeadTimeQuantity");

    public LeadTimeQuantity(LeadTimeQuantityType value) {
        super(NAME, ((Class) LeadTimeQuantityType.class), null, value);
    }

    public LeadTimeQuantity() {
        super(NAME, ((Class) LeadTimeQuantityType.class), null, null);
    }

}
