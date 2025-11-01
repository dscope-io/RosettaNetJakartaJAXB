
package io.dscope.rosettanet.domain.logistics.logistics.v02_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProofOfDeliveryInformation
    extends JAXBElement<ProofOfDeliveryInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", "ProofOfDeliveryInformation");

    public ProofOfDeliveryInformation(ProofOfDeliveryInformationType value) {
        super(NAME, ((Class) ProofOfDeliveryInformationType.class), null, value);
    }

    public ProofOfDeliveryInformation() {
        super(NAME, ((Class) ProofOfDeliveryInformationType.class), null, null);
    }

}
