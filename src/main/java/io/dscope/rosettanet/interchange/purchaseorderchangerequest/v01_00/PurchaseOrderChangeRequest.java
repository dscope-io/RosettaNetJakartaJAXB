
package io.dscope.rosettanet.interchange.purchaseorderchangerequest.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderChangeRequest", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderChangeRequestNotification:xsd:schema:01.00")
public class PurchaseOrderChangeRequest
    extends JAXBElement<PurchaseOrderChangeRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderChangeRequestNotification:xsd:schema:01.00", "PurchaseOrderChangeRequest");

    public PurchaseOrderChangeRequest(PurchaseOrderChangeRequestType value) {
        super(NAME, ((Class) PurchaseOrderChangeRequestType.class), null, value);
    }

    public PurchaseOrderChangeRequest() {
        super(NAME, ((Class) PurchaseOrderChangeRequestType.class), null, null);
    }

}
