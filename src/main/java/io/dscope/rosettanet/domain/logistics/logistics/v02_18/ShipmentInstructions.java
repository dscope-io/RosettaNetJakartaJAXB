
package io.dscope.rosettanet.domain.logistics.logistics.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentInstructions
    extends JAXBElement<ShipmentInstructionsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", "ShipmentInstructions");

    public ShipmentInstructions(ShipmentInstructionsType value) {
        super(NAME, ((Class) ShipmentInstructionsType.class), null, value);
    }

    public ShipmentInstructions() {
        super(NAME, ((Class) ShipmentInstructionsType.class), null, null);
    }

}
