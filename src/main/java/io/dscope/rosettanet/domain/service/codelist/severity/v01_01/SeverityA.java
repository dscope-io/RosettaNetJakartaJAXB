
package io.dscope.rosettanet.domain.service.codelist.severity.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SeverityA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01", "SeverityA");

    public SeverityA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SeverityA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
