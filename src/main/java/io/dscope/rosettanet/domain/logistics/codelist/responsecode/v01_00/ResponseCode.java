
package io.dscope.rosettanet.domain.logistics.codelist.responsecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ResponseCode
    extends JAXBElement<ResponseCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ResponseCode:xsd:codelist:01.00", "ResponseCode");

    public ResponseCode(ResponseCodeType value) {
        super(NAME, ((Class) ResponseCodeType.class), null, value);
    }

    public ResponseCode() {
        super(NAME, ((Class) ResponseCodeType.class), null, null);
    }

}
