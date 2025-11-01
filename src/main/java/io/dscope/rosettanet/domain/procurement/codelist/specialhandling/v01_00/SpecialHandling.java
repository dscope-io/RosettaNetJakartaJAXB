
package io.dscope.rosettanet.domain.procurement.codelist.specialhandling.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialHandling
    extends JAXBElement<SpecialHandlingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:1.0", "SpecialHandling");

    public SpecialHandling(SpecialHandlingType value) {
        super(NAME, ((Class) SpecialHandlingType.class), null, value);
    }

    public SpecialHandling() {
        super(NAME, ((Class) SpecialHandlingType.class), null, null);
    }

}
