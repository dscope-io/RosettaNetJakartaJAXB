
package io.dscope.rosettanet.domain.procurement.procurement.v02_25;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderShippingInformation
    extends JAXBElement<OrderShippingInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", "OrderShippingInformation");

    public OrderShippingInformation(OrderShippingInformationType value) {
        super(NAME, ((Class) OrderShippingInformationType.class), null, value);
    }

    public OrderShippingInformation() {
        super(NAME, ((Class) OrderShippingInformationType.class), null, null);
    }

}
