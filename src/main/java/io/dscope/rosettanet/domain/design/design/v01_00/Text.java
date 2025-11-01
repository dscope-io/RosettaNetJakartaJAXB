
package io.dscope.rosettanet.domain.design.design.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Text
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.01", "Text");

    public Text(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Text() {
        super(NAME, ((Class) String.class), null, null);
    }

}
