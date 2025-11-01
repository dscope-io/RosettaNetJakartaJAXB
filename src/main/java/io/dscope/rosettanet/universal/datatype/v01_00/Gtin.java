
package io.dscope.rosettanet.universal.datatype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Gtin
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DataType:xsd:schema:1.0", "Gtin");

    public Gtin(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Gtin() {
        super(NAME, ((Class) String.class), null, null);
    }

}
