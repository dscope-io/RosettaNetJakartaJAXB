
package io.dscope.rosettanet.domain.service.codelist.severity.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Severity
    extends JAXBElement<SeverityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01", "Severity");

    public Severity(SeverityType value) {
        super(NAME, ((Class) SeverityType.class), null, value);
    }

    public Severity() {
        super(NAME, ((Class) SeverityType.class), null, null);
    }

}
