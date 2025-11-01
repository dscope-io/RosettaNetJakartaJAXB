
package io.dscope.rosettanet.domain.manufacturing.codelist.waferbacksidefinish.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferBackSideFinish
    extends JAXBElement<WaferBackSideFinishType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:1.0", "WaferBackSideFinish");

    public WaferBackSideFinish(WaferBackSideFinishType value) {
        super(NAME, ((Class) WaferBackSideFinishType.class), null, value);
    }

    public WaferBackSideFinish() {
        super(NAME, ((Class) WaferBackSideFinishType.class), null, null);
    }

}
