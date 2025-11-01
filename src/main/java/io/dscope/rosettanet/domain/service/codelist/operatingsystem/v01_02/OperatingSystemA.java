
package io.dscope.rosettanet.domain.service.codelist.operatingsystem.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OperatingSystemA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02", "OperatingSystemA");

    public OperatingSystemA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public OperatingSystemA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
