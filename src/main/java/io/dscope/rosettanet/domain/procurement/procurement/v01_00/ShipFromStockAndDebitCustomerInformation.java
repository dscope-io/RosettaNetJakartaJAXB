
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipFromStockAndDebitCustomerInformation
    extends JAXBElement<ShipFromStockAndDebitCustomerInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ShipFromStockAndDebitCustomerInformation");

    public ShipFromStockAndDebitCustomerInformation(ShipFromStockAndDebitCustomerInformationType value) {
        super(NAME, ((Class) ShipFromStockAndDebitCustomerInformationType.class), null, value);
    }

    public ShipFromStockAndDebitCustomerInformation() {
        super(NAME, ((Class) ShipFromStockAndDebitCustomerInformationType.class), null, null);
    }

}
