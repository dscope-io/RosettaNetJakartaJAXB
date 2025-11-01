
package io.dscope.rosettanet.domain.design.design.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Value
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.19", "Value");

    public Value(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Value() {
        super(NAME, ((Class) String.class), null, null);
    }

}
