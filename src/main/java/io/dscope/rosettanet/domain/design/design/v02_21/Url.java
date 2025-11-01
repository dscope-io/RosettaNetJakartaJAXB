
package io.dscope.rosettanet.domain.design.design.v02_21;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Url
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.21", "url");

    public Url(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Url() {
        super(NAME, ((Class) String.class), null, null);
    }

}
