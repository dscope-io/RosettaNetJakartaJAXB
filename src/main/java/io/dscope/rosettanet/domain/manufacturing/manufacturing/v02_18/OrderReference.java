
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderReference
    extends JAXBElement<OrderReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", "OrderReference");

    public OrderReference(OrderReferenceType value) {
        super(NAME, ((Class) OrderReferenceType.class), null, value);
    }

    public OrderReference() {
        super(NAME, ((Class) OrderReferenceType.class), null, null);
    }

}
