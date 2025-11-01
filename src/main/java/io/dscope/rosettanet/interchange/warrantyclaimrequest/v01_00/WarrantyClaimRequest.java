
package io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "WarrantyClaimRequest", namespace = "urn:rosettanet:specification:interchange:WarrantyClaimRequestNotification:xsd:schema:01.00")
public class WarrantyClaimRequest
    extends JAXBElement<WarrantyClaimRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:WarrantyClaimRequestNotification:xsd:schema:01.00", "WarrantyClaimRequest");

    public WarrantyClaimRequest(WarrantyClaimRequestType value) {
        super(NAME, ((Class) WarrantyClaimRequestType.class), null, value);
    }

    public WarrantyClaimRequest() {
        super(NAME, ((Class) WarrantyClaimRequestType.class), null, null);
    }

}
