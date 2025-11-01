
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimrequestnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipFromStockAndDebitClaimRequest
    extends JAXBElement<ShipFromStockAndDebitClaimRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimRequestNotification:xsd:schema:01.00", "ShipFromStockAndDebitClaimRequest");

    public ShipFromStockAndDebitClaimRequest(ShipFromStockAndDebitClaimRequestType value) {
        super(NAME, ((Class) ShipFromStockAndDebitClaimRequestType.class), null, value);
    }

    public ShipFromStockAndDebitClaimRequest() {
        super(NAME, ((Class) ShipFromStockAndDebitClaimRequestType.class), null, null);
    }

}
