
package io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancy.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReceivingDiscrepancy
    extends JAXBElement<ReceivingDiscrepancyType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.02", "ReceivingDiscrepancy");

    public ReceivingDiscrepancy(ReceivingDiscrepancyType value) {
        super(NAME, ((Class) ReceivingDiscrepancyType.class), null, value);
    }

    public ReceivingDiscrepancy() {
        super(NAME, ((Class) ReceivingDiscrepancyType.class), null, null);
    }

}
