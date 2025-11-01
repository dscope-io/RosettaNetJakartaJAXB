
package io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OrderAdminA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:1.0", "OrderAdminA");

    public OrderAdminA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public OrderAdminA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
