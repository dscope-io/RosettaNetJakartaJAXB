
package io.dscope.rosettanet.domain.logistics.logistics.v02_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TrackingReference
    extends JAXBElement<TrackingReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02", "TrackingReference");

    public TrackingReference(TrackingReferenceType value) {
        super(NAME, ((Class) TrackingReferenceType.class), null, value);
    }

    public TrackingReference() {
        super(NAME, ((Class) TrackingReferenceType.class), null, null);
    }

}
