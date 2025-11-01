
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProofOfDeliveryInformation
    extends JAXBElement<ProofOfDeliveryInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "ProofOfDeliveryInformation");

    public ProofOfDeliveryInformation(ProofOfDeliveryInformationType value) {
        super(NAME, ((Class) ProofOfDeliveryInformationType.class), null, value);
    }

    public ProofOfDeliveryInformation() {
        super(NAME, ((Class) ProofOfDeliveryInformationType.class), null, null);
    }

}
