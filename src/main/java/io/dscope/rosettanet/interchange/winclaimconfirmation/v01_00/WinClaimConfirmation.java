
package io.dscope.rosettanet.interchange.winclaimconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "WinClaimConfirmation", namespace = "urn:rosettanet:specification:interchange:WinClaimConfirmationNotification:xsd:schema:01.00")
public class WinClaimConfirmation
    extends JAXBElement<WinClaimConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:WinClaimConfirmationNotification:xsd:schema:01.00", "WinClaimConfirmation");

    public WinClaimConfirmation(WinClaimConfirmationType value) {
        super(NAME, ((Class) WinClaimConfirmationType.class), null, value);
    }

    public WinClaimConfirmation() {
        super(NAME, ((Class) WinClaimConfirmationType.class), null, null);
    }

}
