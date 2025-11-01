
package io.dscope.rosettanet.domain.service.service.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarrantyInformation
    extends JAXBElement<WarrantyInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.12", "WarrantyInformation");

    public WarrantyInformation(WarrantyInformationType value) {
        super(NAME, ((Class) WarrantyInformationType.class), null, value);
    }

    public WarrantyInformation() {
        super(NAME, ((Class) WarrantyInformationType.class), null, null);
    }

}
