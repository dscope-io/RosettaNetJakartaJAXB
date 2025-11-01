
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderInformation
    extends JAXBElement<OrderInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", "OrderInformation");

    public OrderInformation(OrderInformationType value) {
        super(NAME, ((Class) OrderInformationType.class), null, value);
    }

    public OrderInformation() {
        super(NAME, ((Class) OrderInformationType.class), null, null);
    }

}
