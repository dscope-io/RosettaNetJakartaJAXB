
package io.dscope.rosettanet.domain.procurement.codelist.ordertype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderType
    extends JAXBElement<OrderTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:OrderType:xsd:codelist:01.03", "OrderType");

    public OrderType(OrderTypeType value) {
        super(NAME, ((Class) OrderTypeType.class), null, value);
    }

    public OrderType() {
        super(NAME, ((Class) OrderTypeType.class), null, null);
    }

}
