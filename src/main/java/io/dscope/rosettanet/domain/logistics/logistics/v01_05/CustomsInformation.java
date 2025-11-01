
package io.dscope.rosettanet.domain.logistics.logistics.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomsInformation
    extends JAXBElement<CustomsInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.05", "CustomsInformation");

    public CustomsInformation(CustomsInformationType value) {
        super(NAME, ((Class) CustomsInformationType.class), null, value);
    }

    public CustomsInformation() {
        super(NAME, ((Class) CustomsInformationType.class), null, null);
    }

}
