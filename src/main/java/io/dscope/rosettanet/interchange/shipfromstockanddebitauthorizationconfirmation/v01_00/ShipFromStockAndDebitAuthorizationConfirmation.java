
package io.dscope.rosettanet.interchange.shipfromstockanddebitauthorizationconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShipFromStockAndDebitAuthorizationConfirmation", namespace = "urn:rosettanet:specification:interchange:ShipFromStockAndDebitAuthorizationConfirmationNotification:xsd:schema:01.00")
public class ShipFromStockAndDebitAuthorizationConfirmation
    extends JAXBElement<ShipFromStockAndDebitAuthorizationConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipFromStockAndDebitAuthorizationConfirmationNotification:xsd:schema:01.00", "ShipFromStockAndDebitAuthorizationConfirmation");

    public ShipFromStockAndDebitAuthorizationConfirmation(ShipFromStockAndDebitAuthorizationConfirmationType value) {
        super(NAME, ((Class) ShipFromStockAndDebitAuthorizationConfirmationType.class), null, value);
    }

    public ShipFromStockAndDebitAuthorizationConfirmation() {
        super(NAME, ((Class) ShipFromStockAndDebitAuthorizationConfirmationType.class), null, null);
    }

}
