
package io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestOption
    extends JAXBElement<RequestOptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01", "RequestOption");

    public RequestOption(RequestOptionType value) {
        super(NAME, ((Class) RequestOptionType.class), null, value);
    }

    public RequestOption() {
        super(NAME, ((Class) RequestOptionType.class), null, null);
    }

}
