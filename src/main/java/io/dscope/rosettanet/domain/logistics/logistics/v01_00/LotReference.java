
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotReference
    extends JAXBElement<LotReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "LotReference");

    public LotReference(LotReferenceType value) {
        super(NAME, ((Class) LotReferenceType.class), null, value);
    }

    public LotReference() {
        super(NAME, ((Class) LotReferenceType.class), null, null);
    }

}
