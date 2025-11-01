
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureAnalysis
    extends JAXBElement<FailureAnalysisType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "FailureAnalysis");

    public FailureAnalysis(FailureAnalysisType value) {
        super(NAME, ((Class) FailureAnalysisType.class), null, value);
    }

    public FailureAnalysis() {
        super(NAME, ((Class) FailureAnalysisType.class), null, null);
    }

}
