
package io.dscope.rosettanet.domain.manufacturing.codelist.statuschange.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StatusChangeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.01", "StatusChangeA");

    public StatusChangeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public StatusChangeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
