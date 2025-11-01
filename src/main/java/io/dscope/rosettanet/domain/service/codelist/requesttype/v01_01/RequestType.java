
package io.dscope.rosettanet.domain.service.codelist.requesttype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestType
    extends JAXBElement<RequestTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:RequestType:xsd:codelist:01.01", "RequestType");

    public RequestType(RequestTypeType value) {
        super(NAME, ((Class) RequestTypeType.class), null, value);
    }

    public RequestType() {
        super(NAME, ((Class) RequestTypeType.class), null, null);
    }

}
