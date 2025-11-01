
package io.dscope.rosettanet.universal.datatype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Contact
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DataType:xsd:schema:01.02", "Contact");

    public Contact(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Contact() {
        super(NAME, ((Class) String.class), null, null);
    }

}
