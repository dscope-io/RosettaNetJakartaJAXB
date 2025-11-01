
package io.dscope.rosettanet.universal.datatype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GTIN
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", "GTIN");

    public GTIN(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public GTIN() {
        super(NAME, ((Class) String.class), null, null);
    }

}
