
package io.dscope.rosettanet.domain.manufacturing.codelist.lotquantityclassification.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotQuantityClassificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:01.04", "LotQuantityClassificationA");

    public LotQuantityClassificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LotQuantityClassificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
