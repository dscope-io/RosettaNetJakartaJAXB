
package io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestOptionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.00", "RequestOptionA");

    public RequestOptionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RequestOptionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
