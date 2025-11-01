
package io.dscope.rosettanet.universal.datatype.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Hexadecimal
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", "Hexadecimal");

    public Hexadecimal(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Hexadecimal() {
        super(NAME, ((Class) String.class), null, null);
    }

}
