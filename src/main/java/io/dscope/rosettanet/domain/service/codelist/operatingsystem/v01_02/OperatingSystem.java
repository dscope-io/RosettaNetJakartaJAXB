
package io.dscope.rosettanet.domain.service.codelist.operatingsystem.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OperatingSystem
    extends JAXBElement<OperatingSystemType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02", "OperatingSystem");

    public OperatingSystem(OperatingSystemType value) {
        super(NAME, ((Class) OperatingSystemType.class), null, value);
    }

    public OperatingSystem() {
        super(NAME, ((Class) OperatingSystemType.class), null, null);
    }

}
