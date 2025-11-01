
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipFromStockAndDebitBranchInformation
    extends JAXBElement<ShipFromStockAndDebitBranchInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ShipFromStockAndDebitBranchInformation");

    public ShipFromStockAndDebitBranchInformation(ShipFromStockAndDebitBranchInformationType value) {
        super(NAME, ((Class) ShipFromStockAndDebitBranchInformationType.class), null, value);
    }

    public ShipFromStockAndDebitBranchInformation() {
        super(NAME, ((Class) ShipFromStockAndDebitBranchInformationType.class), null, null);
    }

}
