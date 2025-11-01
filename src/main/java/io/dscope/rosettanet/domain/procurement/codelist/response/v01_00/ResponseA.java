
package io.dscope.rosettanet.domain.procurement.codelist.response.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ResponseA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:Response:xsd:codelist:1.0", "ResponseA");

    public ResponseA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ResponseA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
