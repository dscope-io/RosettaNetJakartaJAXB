
package io.dscope.rosettanet.domain.service.codelist.contactpreference.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContactPreferenceA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01", "ContactPreferenceA");

    public ContactPreferenceA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ContactPreferenceA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
