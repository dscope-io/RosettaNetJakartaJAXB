
package io.dscope.rosettanet.domain.procurement.codelist.customertype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomerTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CustomerType:xsd:codelist:01.02", "CustomerTypeA");

    public CustomerTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CustomerTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
