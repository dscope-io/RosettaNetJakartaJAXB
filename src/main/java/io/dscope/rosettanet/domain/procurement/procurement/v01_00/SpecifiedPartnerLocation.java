
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedPartnerLocation
    extends JAXBElement<SpecifiedPartnerLocationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "SpecifiedPartnerLocation");

    public SpecifiedPartnerLocation(SpecifiedPartnerLocationType value) {
        super(NAME, ((Class) SpecifiedPartnerLocationType.class), null, value);
    }

    public SpecifiedPartnerLocation() {
        super(NAME, ((Class) SpecifiedPartnerLocationType.class), null, null);
    }

}
