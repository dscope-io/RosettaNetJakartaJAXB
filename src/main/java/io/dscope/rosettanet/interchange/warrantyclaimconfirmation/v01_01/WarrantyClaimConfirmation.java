
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "WarrantyClaimConfirmation", namespace = "urn:rosettanet:specification:interchange:WarrantyClaimConfirmation:xsd:schema:01.01")
public class WarrantyClaimConfirmation
    extends JAXBElement<WarrantyClaimConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:WarrantyClaimConfirmation:xsd:schema:01.01", "WarrantyClaimConfirmation");

    public WarrantyClaimConfirmation(WarrantyClaimConfirmationType value) {
        super(NAME, ((Class) WarrantyClaimConfirmationType.class), null, value);
    }

    public WarrantyClaimConfirmation() {
        super(NAME, ((Class) WarrantyClaimConfirmationType.class), null, null);
    }

}
