
package io.dscope.rosettanet.domain.logistics.codelist.lotquantityclassification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotQuantityClassificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:LotQuantityClassification:xsd:codelist:1.0", "LotQuantityClassificationA");

    public LotQuantityClassificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LotQuantityClassificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
