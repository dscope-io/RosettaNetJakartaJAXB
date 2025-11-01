
package io.dscope.rosettanet.domain.design.codelist.actioncode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ActionCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01", "ActionCodeA");

    public ActionCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ActionCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
