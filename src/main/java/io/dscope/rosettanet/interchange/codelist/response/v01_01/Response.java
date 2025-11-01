
package io.dscope.rosettanet.interchange.codelist.response.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Response
    extends JAXBElement<ResponseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:Response:xsd:codelist:01.01", "Response");

    public Response(ResponseType value) {
        super(NAME, ((Class) ResponseType.class), null, value);
    }

    public Response() {
        super(NAME, ((Class) ResponseType.class), null, null);
    }

}
