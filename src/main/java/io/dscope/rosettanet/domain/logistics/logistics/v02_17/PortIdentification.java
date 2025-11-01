
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortIdentification
    extends JAXBElement<PortIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", "PortIdentification");

    public PortIdentification(PortIdentificationType value) {
        super(NAME, ((Class) PortIdentificationType.class), null, value);
    }

    public PortIdentification() {
        super(NAME, ((Class) PortIdentificationType.class), null, null);
    }

}
