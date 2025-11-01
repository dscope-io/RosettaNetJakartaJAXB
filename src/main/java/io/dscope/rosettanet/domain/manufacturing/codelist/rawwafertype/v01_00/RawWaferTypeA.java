
package io.dscope.rosettanet.domain.manufacturing.codelist.rawwafertype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RawWaferTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:1.0", "RawWaferTypeA");

    public RawWaferTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RawWaferTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
