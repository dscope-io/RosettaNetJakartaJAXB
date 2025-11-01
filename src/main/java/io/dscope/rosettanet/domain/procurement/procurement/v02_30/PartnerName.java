
package io.dscope.rosettanet.domain.procurement.procurement.v02_30;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PartnerName
    extends JAXBElement<PartnerNameType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30", "PartnerName");

    public PartnerName(PartnerNameType value) {
        super(NAME, ((Class) PartnerNameType.class), null, value);
    }

    public PartnerName() {
        super(NAME, ((Class) PartnerNameType.class), null, null);
    }

}
