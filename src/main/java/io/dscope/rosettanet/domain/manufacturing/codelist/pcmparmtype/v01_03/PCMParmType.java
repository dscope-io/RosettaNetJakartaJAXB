
package io.dscope.rosettanet.domain.manufacturing.codelist.pcmparmtype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PCMParmType
    extends JAXBElement<PCMParmTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:PCMParmType:xsd:codelist:01.03", "PCMParmType");

    public PCMParmType(PCMParmTypeType value) {
        super(NAME, ((Class) PCMParmTypeType.class), null, value);
    }

    public PCMParmType() {
        super(NAME, ((Class) PCMParmTypeType.class), null, null);
    }

}
