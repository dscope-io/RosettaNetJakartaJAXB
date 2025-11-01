
package io.dscope.rosettanet.domain.shared.shared.v01_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QuantityInformation
    extends JAXBElement<QuantityInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", "QuantityInformation");

    public QuantityInformation(QuantityInformationType value) {
        super(NAME, ((Class) QuantityInformationType.class), null, value);
    }

    public QuantityInformation() {
        super(NAME, ((Class) QuantityInformationType.class), null, null);
    }

}
