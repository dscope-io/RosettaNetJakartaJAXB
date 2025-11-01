
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderReference
    extends JAXBElement<OrderReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.04", "OrderReference");

    public OrderReference(OrderReferenceType value) {
        super(NAME, ((Class) OrderReferenceType.class), null, value);
    }

    public OrderReference() {
        super(NAME, ((Class) OrderReferenceType.class), null, null);
    }

}
