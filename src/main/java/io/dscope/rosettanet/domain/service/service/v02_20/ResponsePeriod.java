
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;

public class ResponsePeriod
    extends JAXBElement<Duration>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "ResponsePeriod");

    public ResponsePeriod(Duration value) {
        super(NAME, ((Class) Duration.class), null, value);
    }

    public ResponsePeriod() {
        super(NAME, ((Class) Duration.class), null, null);
    }

}
