
package io.dscope.rosettanet.interchange.shipfromstockanddebitauthorizationrequest.v01_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShipFromStockAndDebitAuthorizationRequest", namespace = "urn:rosettanet:specification:interchange:ShipFromStockAndDebitAuthorizationRequest:xsd:schema:01.01")
public class ShipFromStockAndDebitAuthorizationRequest
    extends JAXBElement<ShipFromStockAndDebitAuthorizationRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipFromStockAndDebitAuthorizationRequest:xsd:schema:01.01", "ShipFromStockAndDebitAuthorizationRequest");

    public ShipFromStockAndDebitAuthorizationRequest(ShipFromStockAndDebitAuthorizationRequestType value) {
        super(NAME, ((Class) ShipFromStockAndDebitAuthorizationRequestType.class), null, value);
    }

    public ShipFromStockAndDebitAuthorizationRequest() {
        super(NAME, ((Class) ShipFromStockAndDebitAuthorizationRequestType.class), null, null);
    }

}
