
package io.dscope.rosettanet.domain.service.codelist.qualitydisposition.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QualityDisposition
    extends JAXBElement<QualityDispositionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02", "QualityDisposition");

    public QualityDisposition(QualityDispositionType value) {
        super(NAME, ((Class) QualityDispositionType.class), null, value);
    }

    public QualityDisposition() {
        super(NAME, ((Class) QualityDispositionType.class), null, null);
    }

}
