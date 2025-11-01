
package io.dscope.rosettanet.domain.logistics.logistics.v01_09;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentInstructions
    extends JAXBElement<ShipmentInstructionsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.09", "ShipmentInstructions");

    public ShipmentInstructions(ShipmentInstructionsType value) {
        super(NAME, ((Class) ShipmentInstructionsType.class), null, value);
    }

    public ShipmentInstructions() {
        super(NAME, ((Class) ShipmentInstructionsType.class), null, null);
    }

}
