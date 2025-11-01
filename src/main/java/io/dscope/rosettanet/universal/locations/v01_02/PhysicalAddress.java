
package io.dscope.rosettanet.universal.locations.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PhysicalAddress
    extends JAXBElement<PhysicalAddressType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", "PhysicalAddress");

    public PhysicalAddress(PhysicalAddressType value) {
        super(NAME, ((Class) PhysicalAddressType.class), null, value);
    }

    public PhysicalAddress() {
        super(NAME, ((Class) PhysicalAddressType.class), null, null);
    }

}
