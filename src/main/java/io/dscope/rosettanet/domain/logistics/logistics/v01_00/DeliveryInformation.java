
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DeliveryInformation
    extends JAXBElement<DeliveryInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "DeliveryInformation");

    public DeliveryInformation(DeliveryInformationType value) {
        super(NAME, ((Class) DeliveryInformationType.class), null, value);
    }

    public DeliveryInformation() {
        super(NAME, ((Class) DeliveryInformationType.class), null, null);
    }

}
