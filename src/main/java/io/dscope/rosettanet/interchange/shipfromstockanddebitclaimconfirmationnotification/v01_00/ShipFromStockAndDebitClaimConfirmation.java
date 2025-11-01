
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimconfirmationnotification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipFromStockAndDebitClaimConfirmation
    extends JAXBElement<ShipFromStockAndDebitClaimConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimConfirmationNotification:xsd:schema:01.00", "ShipFromStockAndDebitClaimConfirmation");

    public ShipFromStockAndDebitClaimConfirmation(ShipFromStockAndDebitClaimConfirmationType value) {
        super(NAME, ((Class) ShipFromStockAndDebitClaimConfirmationType.class), null, value);
    }

    public ShipFromStockAndDebitClaimConfirmation() {
        super(NAME, ((Class) ShipFromStockAndDebitClaimConfirmationType.class), null, null);
    }

}
