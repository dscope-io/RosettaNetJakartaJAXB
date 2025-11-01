
package io.dscope.rosettanet.domain.procurement.procurement.v01_06;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuantityInformation
    extends JAXBElement<QuantityInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06", "QuantityInformation");

    public QuantityInformation(QuantityInformationType value) {
        super(NAME, ((Class) QuantityInformationType.class), null, value);
    }

    public QuantityInformation() {
        super(NAME, ((Class) QuantityInformationType.class), null, null);
    }

}
