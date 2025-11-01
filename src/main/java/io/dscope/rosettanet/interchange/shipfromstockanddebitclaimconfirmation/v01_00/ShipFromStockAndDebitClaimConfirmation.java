
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShipFromStockAndDebitClaimConfirmation", namespace = "urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimConfirmation:xsd:schema:01.00")
public class ShipFromStockAndDebitClaimConfirmation
    extends JAXBElement<ShipFromStockAndDebitClaimConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimConfirmation:xsd:schema:01.00", "ShipFromStockAndDebitClaimConfirmation");

    public ShipFromStockAndDebitClaimConfirmation(ShipFromStockAndDebitClaimConfirmationType value) {
        super(NAME, ((Class) ShipFromStockAndDebitClaimConfirmationType.class), null, value);
    }

    public ShipFromStockAndDebitClaimConfirmation() {
        super(NAME, ((Class) ShipFromStockAndDebitClaimConfirmationType.class), null, null);
    }

}
