
package io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ChangeReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04", "ChangeReasonA");

    public ChangeReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ChangeReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
