
package io.dscope.rosettanet.domain.manufacturing.codelist.pcmparmtype.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PCMParmTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:PCMParmType:xsd:codelist:01.04", "PCMParmTypeA");

    public PCMParmTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PCMParmTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
