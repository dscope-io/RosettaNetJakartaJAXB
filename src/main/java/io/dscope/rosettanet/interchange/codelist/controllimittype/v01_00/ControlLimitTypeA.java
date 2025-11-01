
package io.dscope.rosettanet.interchange.codelist.controllimittype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ControlLimitTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ControlLimitType:xsd:codelist:1.0", "ControlLimitTypeA");

    public ControlLimitTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ControlLimitTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
