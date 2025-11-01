
package io.dscope.rosettanet.domain.manufacturing.codelist.waferpassivation.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WaferPassivation
    extends JAXBElement<WaferPassivationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WaferPassivation:xsd:codelist:01.02", "WaferPassivation");

    public WaferPassivation(WaferPassivationType value) {
        super(NAME, ((Class) WaferPassivationType.class), null, value);
    }

    public WaferPassivation() {
        super(NAME, ((Class) WaferPassivationType.class), null, null);
    }

}
