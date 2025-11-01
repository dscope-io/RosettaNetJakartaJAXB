
package io.dscope.rosettanet.domain.manufacturing.codelist.bits.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BitsA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Bits:xsd:codelist:01.03", "BitsA");

    public BitsA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public BitsA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
