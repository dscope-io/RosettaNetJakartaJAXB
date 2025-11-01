
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotReference
    extends JAXBElement<LotReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", "LotReference");

    public LotReference(LotReferenceType value) {
        super(NAME, ((Class) LotReferenceType.class), null, value);
    }

    public LotReference() {
        super(NAME, ((Class) LotReferenceType.class), null, null);
    }

}
