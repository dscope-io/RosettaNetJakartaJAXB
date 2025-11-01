
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RemitTo
    extends JAXBElement<RemitToType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "RemitTo");

    public RemitTo(RemitToType value) {
        super(NAME, ((Class) RemitToType.class), null, value);
    }

    public RemitTo() {
        super(NAME, ((Class) RemitToType.class), null, null);
    }

}
