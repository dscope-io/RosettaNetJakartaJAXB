
package io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TrackingReferenceTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.03", "TrackingReferenceTypeA");

    public TrackingReferenceTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TrackingReferenceTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
