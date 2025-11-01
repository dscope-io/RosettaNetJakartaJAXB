
package io.dscope.rosettanet.interchange.purchaseordercancellationconfirmation.v02_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderCancellationConfirmation", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderCancellationConfirmation:xsd:schema:02.01")
public class PurchaseOrderCancellationConfirmation
    extends JAXBElement<PurchaseOrderCancellationConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderCancellationConfirmation:xsd:schema:02.01", "PurchaseOrderCancellationConfirmation");

    public PurchaseOrderCancellationConfirmation(PurchaseOrderCancellationConfirmationType value) {
        super(NAME, ((Class) PurchaseOrderCancellationConfirmationType.class), null, value);
    }

    public PurchaseOrderCancellationConfirmation() {
        super(NAME, ((Class) PurchaseOrderCancellationConfirmationType.class), null, null);
    }

}
