
package io.dscope.rosettanet.domain.procurement.codelist.requoteaction.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequoteActionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:1.0", "RequoteActionA");

    public RequoteActionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RequoteActionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
