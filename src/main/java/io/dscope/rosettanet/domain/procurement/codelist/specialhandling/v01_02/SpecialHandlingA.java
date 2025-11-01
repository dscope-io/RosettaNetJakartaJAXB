
package io.dscope.rosettanet.domain.procurement.codelist.specialhandling.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialHandlingA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:01.02", "SpecialHandlingA");

    public SpecialHandlingA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SpecialHandlingA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
