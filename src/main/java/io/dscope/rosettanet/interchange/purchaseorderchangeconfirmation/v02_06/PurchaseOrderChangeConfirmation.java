
package io.dscope.rosettanet.interchange.purchaseorderchangeconfirmation.v02_06;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PurchaseOrderChangeConfirmation", namespace = "urn:rosettanet:specification:interchange:PurchaseOrderChangeConfirmation:xsd:schema:02.06")
public class PurchaseOrderChangeConfirmation
    extends JAXBElement<PurchaseOrderChangeConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PurchaseOrderChangeConfirmation:xsd:schema:02.06", "PurchaseOrderChangeConfirmation");

    public PurchaseOrderChangeConfirmation(PurchaseOrderChangeConfirmationType value) {
        super(NAME, ((Class) PurchaseOrderChangeConfirmationType.class), null, value);
    }

    public PurchaseOrderChangeConfirmation() {
        super(NAME, ((Class) PurchaseOrderChangeConfirmationType.class), null, null);
    }

}
