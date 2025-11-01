
package io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancy.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReceivingDiscrepancyA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.03", "ReceivingDiscrepancyA");

    public ReceivingDiscrepancyA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ReceivingDiscrepancyA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
