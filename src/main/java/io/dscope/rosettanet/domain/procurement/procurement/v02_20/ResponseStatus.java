
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ResponseStatus
    extends JAXBElement<ResponseStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", "ResponseStatus");

    public ResponseStatus(ResponseStatusType value) {
        super(NAME, ((Class) ResponseStatusType.class), null, value);
    }

    public ResponseStatus() {
        super(NAME, ((Class) ResponseStatusType.class), null, null);
    }

}
