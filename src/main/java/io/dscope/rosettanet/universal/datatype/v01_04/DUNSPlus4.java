
package io.dscope.rosettanet.universal.datatype.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DUNSPlus4
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", "DUNSPlus4");

    public DUNSPlus4(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public DUNSPlus4() {
        super(NAME, ((Class) String.class), null, null);
    }

}
