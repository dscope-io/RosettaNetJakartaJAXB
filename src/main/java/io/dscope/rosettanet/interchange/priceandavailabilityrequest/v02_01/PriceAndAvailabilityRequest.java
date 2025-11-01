
package io.dscope.rosettanet.interchange.priceandavailabilityrequest.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PriceAndAvailabilityRequest", namespace = "urn:rosettanet:specification:interchange:PriceAndAvailabilityRequest:xsd:schema:02.01")
public class PriceAndAvailabilityRequest
    extends JAXBElement<PriceAndAvailabilityRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PriceAndAvailabilityRequest:xsd:schema:02.01", "PriceAndAvailabilityRequest");

    public PriceAndAvailabilityRequest(PriceAndAvailabilityRequestType value) {
        super(NAME, ((Class) PriceAndAvailabilityRequestType.class), null, value);
    }

    public PriceAndAvailabilityRequest() {
        super(NAME, ((Class) PriceAndAvailabilityRequestType.class), null, null);
    }

}
