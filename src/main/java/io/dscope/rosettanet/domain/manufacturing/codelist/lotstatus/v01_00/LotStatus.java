
package io.dscope.rosettanet.domain.manufacturing.codelist.lotstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotStatus
    extends JAXBElement<LotStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:1.0", "LotStatus");

    public LotStatus(LotStatusType value) {
        super(NAME, ((Class) LotStatusType.class), null, value);
    }

    public LotStatus() {
        super(NAME, ((Class) LotStatusType.class), null, null);
    }

}
