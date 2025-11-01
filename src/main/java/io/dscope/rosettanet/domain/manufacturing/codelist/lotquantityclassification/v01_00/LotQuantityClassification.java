
package io.dscope.rosettanet.domain.manufacturing.codelist.lotquantityclassification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotQuantityClassification
    extends JAXBElement<LotQuantityClassificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:1.0", "LotQuantityClassification");

    public LotQuantityClassification(LotQuantityClassificationType value) {
        super(NAME, ((Class) LotQuantityClassificationType.class), null, value);
    }

    public LotQuantityClassification() {
        super(NAME, ((Class) LotQuantityClassificationType.class), null, null);
    }

}
