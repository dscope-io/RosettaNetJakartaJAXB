
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PackingSlip
    extends JAXBElement<PackingSlipType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "PackingSlip");

    public PackingSlip(PackingSlipType value) {
        super(NAME, ((Class) PackingSlipType.class), null, value);
    }

    public PackingSlip() {
        super(NAME, ((Class) PackingSlipType.class), null, null);
    }

}
