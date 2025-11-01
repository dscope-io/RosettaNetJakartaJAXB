
package io.dscope.rosettanet.universal.contactinformation.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContactAndPhone
    extends JAXBElement<ContactAndPhoneType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.02", "ContactAndPhone");

    public ContactAndPhone(ContactAndPhoneType value) {
        super(NAME, ((Class) ContactAndPhoneType.class), null, value);
    }

    public ContactAndPhone() {
        super(NAME, ((Class) ContactAndPhoneType.class), null, null);
    }

}
