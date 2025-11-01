
package io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ConfirmationType
    extends JAXBElement<ConfirmationTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:1.0", "ConfirmationType");

    public ConfirmationType(ConfirmationTypeType value) {
        super(NAME, ((Class) ConfirmationTypeType.class), null, value);
    }

    public ConfirmationType() {
        super(NAME, ((Class) ConfirmationTypeType.class), null, null);
    }

}
