
package io.dscope.rosettanet.interchange.winclaimrequest.v02_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "WinClaimRequest", namespace = "urn:rosettanet:specification:interchange:WinClaimRequest:xsd:schema:02.00")
public class WinClaimRequest
    extends JAXBElement<WinClaimRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:WinClaimRequest:xsd:schema:02.00", "WinClaimRequest");

    public WinClaimRequest(WinClaimRequestType value) {
        super(NAME, ((Class) WinClaimRequestType.class), null, value);
    }

    public WinClaimRequest() {
        super(NAME, ((Class) WinClaimRequestType.class), null, null);
    }

}
