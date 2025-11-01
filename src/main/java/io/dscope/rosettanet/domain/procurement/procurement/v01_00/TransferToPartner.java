
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TransferToPartner
    extends JAXBElement<TransferToPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "TransferToPartner");

    public TransferToPartner(TransferToPartnerType value) {
        super(NAME, ((Class) TransferToPartnerType.class), null, value);
    }

    public TransferToPartner() {
        super(NAME, ((Class) TransferToPartnerType.class), null, null);
    }

}
