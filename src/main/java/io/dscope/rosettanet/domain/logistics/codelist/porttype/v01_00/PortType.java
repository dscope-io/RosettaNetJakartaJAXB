
package io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortType
    extends JAXBElement<PortTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PortType:xsd:codelist:1.0", "PortType");

    public PortType(PortTypeType value) {
        super(NAME, ((Class) PortTypeType.class), null, value);
    }

    public PortType() {
        super(NAME, ((Class) PortTypeType.class), null, null);
    }

}
