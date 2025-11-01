
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedPartnerContact
    extends JAXBElement<SpecifiedPartnerContactType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "SpecifiedPartnerContact");

    public SpecifiedPartnerContact(SpecifiedPartnerContactType value) {
        super(NAME, ((Class) SpecifiedPartnerContactType.class), null, value);
    }

    public SpecifiedPartnerContact() {
        super(NAME, ((Class) SpecifiedPartnerContactType.class), null, null);
    }

}
