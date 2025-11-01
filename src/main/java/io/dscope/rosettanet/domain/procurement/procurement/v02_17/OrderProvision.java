
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderProvision
    extends JAXBElement<OrderProvisionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", "OrderProvision");

    public OrderProvision(OrderProvisionType value) {
        super(NAME, ((Class) OrderProvisionType.class), null, value);
    }

    public OrderProvision() {
        super(NAME, ((Class) OrderProvisionType.class), null, null);
    }

}
