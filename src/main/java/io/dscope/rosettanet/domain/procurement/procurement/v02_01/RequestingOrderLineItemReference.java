
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestingOrderLineItemReference
    extends JAXBElement<RequestingOrderLineItemReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", "RequestingOrderLineItemReference");

    public RequestingOrderLineItemReference(RequestingOrderLineItemReferenceType value) {
        super(NAME, ((Class) RequestingOrderLineItemReferenceType.class), null, value);
    }

    public RequestingOrderLineItemReference() {
        super(NAME, ((Class) RequestingOrderLineItemReferenceType.class), null, null);
    }

}
