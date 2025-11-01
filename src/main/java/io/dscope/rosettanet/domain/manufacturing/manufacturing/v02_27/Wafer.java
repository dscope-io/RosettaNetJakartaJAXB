
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Wafer
    extends JAXBElement<WaferType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", "Wafer");

    public Wafer(WaferType value) {
        super(NAME, ((Class) WaferType.class), null, value);
    }

    public Wafer() {
        super(NAME, ((Class) WaferType.class), null, null);
    }

}
