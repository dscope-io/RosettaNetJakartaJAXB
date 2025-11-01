
package io.dscope.rosettanet.domain.design.codelist.abccode.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ABCCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.01", "ABCCodeA");

    public ABCCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ABCCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
