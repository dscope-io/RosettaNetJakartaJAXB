
package io.dscope.rosettanet.domain.design.codelist.abccode.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ABCCode
    extends JAXBElement<ABCCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.01", "ABCCode");

    public ABCCode(ABCCodeType value) {
        super(NAME, ((Class) ABCCodeType.class), null, value);
    }

    public ABCCode() {
        super(NAME, ((Class) ABCCodeType.class), null, null);
    }

}
