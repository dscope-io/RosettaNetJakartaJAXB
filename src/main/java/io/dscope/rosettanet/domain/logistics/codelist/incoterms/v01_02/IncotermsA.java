
package io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IncotermsA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.02", "IncotermsA");

    public IncotermsA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public IncotermsA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
