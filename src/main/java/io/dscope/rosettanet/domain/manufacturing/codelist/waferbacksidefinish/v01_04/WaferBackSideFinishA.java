
package io.dscope.rosettanet.domain.manufacturing.codelist.waferbacksidefinish.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferBackSideFinishA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:01.04", "WaferBackSideFinishA");

    public WaferBackSideFinishA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WaferBackSideFinishA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
