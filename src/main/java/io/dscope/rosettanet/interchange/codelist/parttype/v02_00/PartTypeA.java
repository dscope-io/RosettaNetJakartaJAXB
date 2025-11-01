
package io.dscope.rosettanet.interchange.codelist.parttype.v02_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PartTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00", "PartTypeA");

    public PartTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PartTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
