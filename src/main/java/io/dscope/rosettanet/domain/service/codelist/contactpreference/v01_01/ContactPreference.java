
package io.dscope.rosettanet.domain.service.codelist.contactpreference.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContactPreference
    extends JAXBElement<ContactPreferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01", "ContactPreference");

    public ContactPreference(ContactPreferenceType value) {
        super(NAME, ((Class) ContactPreferenceType.class), null, value);
    }

    public ContactPreference() {
        super(NAME, ((Class) ContactPreferenceType.class), null, null);
    }

}
