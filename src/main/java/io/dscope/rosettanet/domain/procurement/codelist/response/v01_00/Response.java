
package io.dscope.rosettanet.domain.procurement.codelist.response.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Response
    extends JAXBElement<ResponseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:Response:xsd:codelist:1.0", "Response");

    public Response(ResponseType value) {
        super(NAME, ((Class) ResponseType.class), null, value);
    }

    public Response() {
        super(NAME, ((Class) ResponseType.class), null, null);
    }

}
