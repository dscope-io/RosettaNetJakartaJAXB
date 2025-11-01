
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortIdentification
    extends JAXBElement<PortIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "PortIdentification");

    public PortIdentification(PortIdentificationType value) {
        super(NAME, ((Class) PortIdentificationType.class), null, value);
    }

    public PortIdentification() {
        super(NAME, ((Class) PortIdentificationType.class), null, null);
    }

}
