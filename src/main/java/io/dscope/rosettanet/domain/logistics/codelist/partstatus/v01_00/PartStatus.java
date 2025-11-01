
package io.dscope.rosettanet.domain.logistics.codelist.partstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PartStatus
    extends JAXBElement<PartStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PartStatus:xsd:codelist:01.00", "PartStatus");

    public PartStatus(PartStatusType value) {
        super(NAME, ((Class) PartStatusType.class), null, value);
    }

    public PartStatus() {
        super(NAME, ((Class) PartStatusType.class), null, null);
    }

}
