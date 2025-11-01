
package io.dscope.rosettanet.domain.design.design.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Directive
    extends JAXBElement<DirectiveType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.17", "Directive");

    public Directive(DirectiveType value) {
        super(NAME, ((Class) DirectiveType.class), null, value);
    }

    public Directive() {
        super(NAME, ((Class) DirectiveType.class), null, null);
    }

}
