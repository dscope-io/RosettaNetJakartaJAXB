
package io.dscope.rosettanet.interchange.shipfromstockanddebitauthorizationconfirmation.v01_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShipFromStockAndDebitAuthorizationConfirmation", namespace = "urn:rosettanet:specification:interchange:ShipFromStockAndDebitAuthorizationConfirmation:xsd:schema:01.01")
public class ShipFromStockAndDebitAuthorizationConfirmation
    extends JAXBElement<ShipFromStockAndDebitAuthorizationConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipFromStockAndDebitAuthorizationConfirmation:xsd:schema:01.01", "ShipFromStockAndDebitAuthorizationConfirmation");

    public ShipFromStockAndDebitAuthorizationConfirmation(ShipFromStockAndDebitAuthorizationConfirmationType value) {
        super(NAME, ((Class) ShipFromStockAndDebitAuthorizationConfirmationType.class), null, value);
    }

    public ShipFromStockAndDebitAuthorizationConfirmation() {
        super(NAME, ((Class) ShipFromStockAndDebitAuthorizationConfirmationType.class), null, null);
    }

}
