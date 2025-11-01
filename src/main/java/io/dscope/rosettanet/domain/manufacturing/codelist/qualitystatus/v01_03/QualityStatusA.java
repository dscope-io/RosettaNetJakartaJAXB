
package io.dscope.rosettanet.domain.manufacturing.codelist.qualitystatus.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QualityStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.03", "QualityStatusA");

    public QualityStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QualityStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
