
package io.dscope.rosettanet.domain.logistics.logistics.v02_16;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortInformation
    extends JAXBElement<PortInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.16", "PortInformation");

    public PortInformation(PortInformationType value) {
        super(NAME, ((Class) PortInformationType.class), null, value);
    }

    public PortInformation() {
        super(NAME, ((Class) PortInformationType.class), null, null);
    }

}
