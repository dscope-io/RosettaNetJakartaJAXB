
package io.dscope.rosettanet.domain.procurement.codelist.ordertype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:OrderType:xsd:codelist:01.03", "OrderTypeA");

    public OrderTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public OrderTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
