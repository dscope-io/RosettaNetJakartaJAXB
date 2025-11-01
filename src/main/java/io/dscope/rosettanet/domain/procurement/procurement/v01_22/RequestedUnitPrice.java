
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestedUnitPrice
    extends JAXBElement<RequestedUnitPriceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", "RequestedUnitPrice");

    public RequestedUnitPrice(RequestedUnitPriceType value) {
        super(NAME, ((Class) RequestedUnitPriceType.class), null, value);
    }

    public RequestedUnitPrice() {
        super(NAME, ((Class) RequestedUnitPriceType.class), null, null);
    }

}
