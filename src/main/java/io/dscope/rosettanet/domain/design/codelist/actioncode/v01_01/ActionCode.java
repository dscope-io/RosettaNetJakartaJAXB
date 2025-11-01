
package io.dscope.rosettanet.domain.design.codelist.actioncode.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ActionCode
    extends JAXBElement<ActionCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01", "ActionCode");

    public ActionCode(ActionCodeType value) {
        super(NAME, ((Class) ActionCodeType.class), null, value);
    }

    public ActionCode() {
        super(NAME, ((Class) ActionCodeType.class), null, null);
    }

}
