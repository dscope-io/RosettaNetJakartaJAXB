
package io.dscope.rosettanet.domain.logistics.codelist.urgencycode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class UrgencyCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:UrgencyCode:xsd:codelist:01.00", "UrgencyCodeA");

    public UrgencyCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public UrgencyCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
