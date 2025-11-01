
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippedQuantityInformation
    extends JAXBElement<ShippedQuantityInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16", "ShippedQuantityInformation");

    public ShippedQuantityInformation(ShippedQuantityInformationType value) {
        super(NAME, ((Class) ShippedQuantityInformationType.class), null, value);
    }

    public ShippedQuantityInformation() {
        super(NAME, ((Class) ShippedQuantityInformationType.class), null, null);
    }

}
