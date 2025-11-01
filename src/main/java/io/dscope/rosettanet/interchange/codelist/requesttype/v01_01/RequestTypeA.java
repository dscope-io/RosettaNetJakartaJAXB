
package io.dscope.rosettanet.interchange.codelist.requesttype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.01", "RequestTypeA");

    public RequestTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RequestTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
