
package io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ConfirmationTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03", "ConfirmationTypeA");

    public ConfirmationTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ConfirmationTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
