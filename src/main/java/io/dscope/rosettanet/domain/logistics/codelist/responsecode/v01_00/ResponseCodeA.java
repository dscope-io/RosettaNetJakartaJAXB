
package io.dscope.rosettanet.domain.logistics.codelist.responsecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ResponseCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ResponseCode:xsd:codelist:01.00", "ResponseCodeA");

    public ResponseCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ResponseCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
