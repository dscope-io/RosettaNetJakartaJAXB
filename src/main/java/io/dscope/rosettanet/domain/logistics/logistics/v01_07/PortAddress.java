
package io.dscope.rosettanet.domain.logistics.logistics.v01_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortAddress
    extends JAXBElement<PortAddressType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", "PortAddress");

    public PortAddress(PortAddressType value) {
        super(NAME, ((Class) PortAddressType.class), null, value);
    }

    public PortAddress() {
        super(NAME, ((Class) PortAddressType.class), null, null);
    }

}
