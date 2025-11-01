
package io.dscope.rosettanet.domain.design.design.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Text
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.17", "Text");

    public Text(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Text() {
        super(NAME, ((Class) String.class), null, null);
    }

}
