
package io.dscope.rosettanet.domain.logistics.logistics.v02_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransportInformation
    extends JAXBElement<TransportInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02", "TransportInformation");

    public TransportInformation(TransportInformationType value) {
        super(NAME, ((Class) TransportInformationType.class), null, value);
    }

    public TransportInformation() {
        super(NAME, ((Class) TransportInformationType.class), null, null);
    }

}
