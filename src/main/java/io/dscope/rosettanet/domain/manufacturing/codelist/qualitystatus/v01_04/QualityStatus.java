
package io.dscope.rosettanet.domain.manufacturing.codelist.qualitystatus.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QualityStatus
    extends JAXBElement<QualityStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.04", "QualityStatus");

    public QualityStatus(QualityStatusType value) {
        super(NAME, ((Class) QualityStatusType.class), null, value);
    }

    public QualityStatus() {
        super(NAME, ((Class) QualityStatusType.class), null, null);
    }

}
