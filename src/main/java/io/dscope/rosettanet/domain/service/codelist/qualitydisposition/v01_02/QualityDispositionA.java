
package io.dscope.rosettanet.domain.service.codelist.qualitydisposition.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QualityDispositionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02", "QualityDispositionA");

    public QualityDispositionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public QualityDispositionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
