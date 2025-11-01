
package io.dscope.rosettanet.interchange.purchaseorderrequest.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderRequest", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderRequestNotification:xsd:schema:01.00")
public class PurchaseOrderRequest
    extends JAXBElement<PurchaseOrderRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderRequestNotification:xsd:schema:01.00", "PurchaseOrderRequest");

    public PurchaseOrderRequest(PurchaseOrderRequestType value) {
        super(NAME, ((Class) PurchaseOrderRequestType.class), null, value);
    }

    public PurchaseOrderRequest() {
        super(NAME, ((Class) PurchaseOrderRequestType.class), null, null);
    }

}
