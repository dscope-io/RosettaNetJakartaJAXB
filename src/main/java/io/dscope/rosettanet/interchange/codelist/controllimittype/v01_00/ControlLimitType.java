
package io.dscope.rosettanet.interchange.codelist.controllimittype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ControlLimitType
    extends JAXBElement<ControlLimitTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ControlLimitType:xsd:codelist:1.0", "ControlLimitType");

    public ControlLimitType(ControlLimitTypeType value) {
        super(NAME, ((Class) ControlLimitTypeType.class), null, value);
    }

    public ControlLimitType() {
        super(NAME, ((Class) ControlLimitTypeType.class), null, null);
    }

}
