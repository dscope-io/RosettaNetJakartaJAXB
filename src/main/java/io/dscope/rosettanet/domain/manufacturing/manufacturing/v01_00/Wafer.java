
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Wafer
    extends JAXBElement<WaferType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", "Wafer");

    public Wafer(WaferType value) {
        super(NAME, ((Class) WaferType.class), null, value);
    }

    public Wafer() {
        super(NAME, ((Class) WaferType.class), null, null);
    }

}
