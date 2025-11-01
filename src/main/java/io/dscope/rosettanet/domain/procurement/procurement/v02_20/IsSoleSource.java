
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsSoleSource
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", "IsSoleSource");

    public IsSoleSource(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsSoleSource() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
